package com.mgt.ecommerce.controller;

import com.mgt.ecommerce.dto.LoginDTO;
import com.mgt.ecommerce.dto.SignUpDTO;
import com.mgt.ecommerce.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class SignRest {

    private final UserService userService;

    public SignRest(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public String signUp(@Valid @ModelAttribute SignUpDTO signUpDTO) {
        userService.register(signUpDTO);
        return "redirect:/login";
    }

    @PostMapping("/login")
    public String signinController( @ModelAttribute("loginobj") LoginDTO loginDto ,Model model) {

        try {
            userService.loginHandler(loginDto);
            return "redirect:/home";
        } catch (RuntimeException e) {
            if (e.getMessage().equals("USER_NOT_REGISTERED")){
                model.addAttribute("emailError","User not found with this email please register");
            } else if (e.getMessage().equals("WRONG_PASSWORD")) {
                model.addAttribute("passError","Email or Password is not Correct");
            }
        }
        return("login");
    }

}
