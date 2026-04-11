package com.mgt.ecommerce.controller;

import com.mgt.ecommerce.dto.SignUpDTO;
import org.apache.catalina.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class SignRest {

    @PostMapping("/signUp")
    public void signUp(@ModelAttribute SignUpDTO signUpDTO){
        System.out.println("signUp Email: "+signUpDTO.email);
        System.out.println("signUp Password: "+signUpDTO.password);
    }
}
