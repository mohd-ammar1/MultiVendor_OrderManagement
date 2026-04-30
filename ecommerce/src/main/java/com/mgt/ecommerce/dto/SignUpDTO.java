
package com.mgt.ecommerce.dto;

import com.mgt.ecommerce.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.NumberFormat;

@Getter
@Setter
@NoArgsConstructor
public class SignUpDTO {

    @NotBlank(message = "Name can't be blank")
    private String name;

    @NotBlank(message = "Email Can't be blank")
    @Email(message = "Email is not correct")
    private String email;

    @NumberFormat
    private String mobile;

    private Role role;

    @NotBlank(message = "Password Can't be blank")
    private String password;

}

