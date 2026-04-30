package com.mgt.ecommerce.service;

import com.mgt.ecommerce.dto.LoginDTO;
import com.mgt.ecommerce.dto.SignUpDTO;
import com.mgt.ecommerce.entity.User;
import com.mgt.ecommerce.repositry.UserRepositry;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepositry userRepositry;

    public void register(SignUpDTO signUpDTO) {
        User user = new User();
        user.setName(signUpDTO.getName());
        user.setEmail(signUpDTO.getEmail());
        user.setRole(signUpDTO.getRole());
        user.setPhone(signUpDTO.getMobile());
        user.setPassword(encoder.encode(signUpDTO.getPassword()));
        userRepositry.save(user);
    }

    public User loginHandler(LoginDTO loginDTO) {
        User user = userRepositry.findByemail(loginDTO.getEmail());

        if (user == null) {
            throw new RuntimeException("USER_NOT_REGISTERED");
        }

        boolean correct = encoder.matches(loginDTO.getPassword(), user.getPassword());
        if (correct) {
            return user;
        } else {
            throw new RuntimeException("WRONG_PASSWORD");
        }
    }

}