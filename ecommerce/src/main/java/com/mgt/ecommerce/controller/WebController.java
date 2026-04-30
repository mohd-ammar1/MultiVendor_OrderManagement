package com.mgt.ecommerce.controller;

import com.mgt.ecommerce.dto.LoginDTO;
import com.mgt.ecommerce.dto.SignUpDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WebController {

    @GetMapping("/home")
    public String home(){
        return"home";
    }

    @GetMapping("/signup")
    public String signUp(Model model){
        model.addAttribute("signUpDTO", new SignUpDTO());
        return("signup");
    }
    @GetMapping("/sign")
    public String login(Model model){
        model.addAttribute("loginobj", new LoginDTO());
        model.addAttribute("baseobj" ,"");
        return "login";
    }

    @PostMapping("/signUp")
    public String signUp(@Valid @ModelAttribute SignUpDTO signUpDTO){
        System.out.println("signUp Email: "+signUpDTO.getEmail());
        System.out.println("signUp Password: "+signUpDTO.getPassword());
        return "redirect:/home";
    }
}
