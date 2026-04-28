package com.mgt.ecommerce.controller;

import com.mgt.ecommerce.dto.SignUpDTO;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class SignRest {

    @PostMapping("/signup")
    public void signUp(@Valid @ModelAttribute SignUpDTO signUpDTO){
        System.out.println("signUp Name: "+signUpDTO.getName());
        System.out.println("signUp Phone: "+signUpDTO.getMobile());
        System.out.println("signUp Email: "+signUpDTO.getEmail());
        System.out.println("SignUp Role: "+signUpDTO.getRole());
        System.out.println("signUp Password: "+signUpDTO.getPassword());
    }

}
