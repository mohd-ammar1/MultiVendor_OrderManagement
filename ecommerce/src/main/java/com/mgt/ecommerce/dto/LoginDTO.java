package com.mgt.ecommerce.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {

    @Email(message = "Email is Required")
    private String email;

    private String password;
}
