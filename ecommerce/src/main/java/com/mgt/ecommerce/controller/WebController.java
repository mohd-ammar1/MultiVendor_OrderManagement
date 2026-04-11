package com.mgt.ecommerce.controller;

import com.mgt.ecommerce.dto.SignUpDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class WebController {

    @GetMapping("/home")
    public String home(){
        return"index";
    }

    @GetMapping("/sign")
    public String signUp(Model model){
        model.addAttribute("signUpDTO", new SignUpDTO());
        return("signup");
    }
}
