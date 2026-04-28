//package com.mgt.ecommerce.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurity  {
//
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorizeRequest -> authorizeRequest
//                        .anyRequest().authenticated()
//                )
//                .formLogin(Customizer.withDefaults());
//        return http.build();
//    }
//}
