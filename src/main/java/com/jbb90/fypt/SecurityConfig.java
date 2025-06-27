package com.jbb90.fypt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // Allow all requests for now
            )
            .formLogin(form -> form
                .loginPage("/login") // Use your custom login page
                .permitAll()
            )
            .logout(logout -> logout.permitAll());
        return http.build();
    }
} 