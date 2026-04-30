package com.mgt.ecommerce.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Email
    private String email;

    @Pattern(regexp = "^\\+?[1-9]\\d{7,14}$", message = "Invalid phone number")
    private String phone;

    private String password;

}
