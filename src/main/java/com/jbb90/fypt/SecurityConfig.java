package com.jbb90.fypt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Spring Security configuration for the FYP Tracker application.
 * Configures custom login page, endpoint permissions, and basic security settings.
 */
@Configuration
public class SecurityConfig {
    /**
     * Configures the security filter chain for HTTP requests.
     *
     * - Permits access to /login, /do-login, /dashboard, and static resources for all users.
     * - Allows all other requests (for demo/development purposes).
     * - Sets up a custom login page at /login.
     * - Enables logout functionality.
     *
     * @param http the HttpSecurity object to configure
     * @return the configured SecurityFilterChain
     * @throws Exception if a security configuration error occurs
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
            .requestMatchers("/login", "/do-login", "/dashboard", "/css/**", "/js/**").permitAll()
            .anyRequest().permitAll()
            )
            .formLogin(form -> form
                .loginPage("/login") 
                .permitAll()
            )
            .logout(logout -> logout.permitAll());
        return http.build();
    }
} 