package com.example.JOBNOVA.JOBNOVA.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http) throws Exception {

        http

                .authorizeHttpRequests(auth -> auth

                        .requestMatchers(
                                "/",
                                "/index.html",
                                "/css/**",
                                "/js/**",
                                "/images/**",
                                "/static/**",
                                "/h2-console/**",
                                "/login",
                                "/register",
                                "/oauth2/**",
                                "/ai.html",
                                "/api/ai/**"
                        )

                        .permitAll()

                        .anyRequest()
                        .authenticated()
                )

                // CSRF disabled
                .csrf(csrf -> csrf.disable())

                .headers(headers -> headers

                        .frameOptions(frame ->
                                frame.sameOrigin()
                        )
                )

                // Username + Password Login
                .formLogin(form -> form

                        .loginPage("/index.html")

                        .loginProcessingUrl("/login")

                        .defaultSuccessUrl(
                                "/home.html",
                                true
                        )

                        .failureUrl(
                                "/index.html?error=true"
                        )

                        .permitAll()
                )

                // Google / GitHub Login
                .oauth2Login(oauth -> oauth

                        .defaultSuccessUrl(
                                "/home.html",
                                true
                        )
                )

                // Logout
                .logout(logout -> logout

                        .logoutUrl("/logout")

                        .logoutSuccessUrl(
                                "/index.html"
                        )

                        .invalidateHttpSession(true)

                        .clearAuthentication(true)

                        .deleteCookies(
                                "JSESSIONID"
                        )

                        .permitAll()
                );

        return http.build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();
    }
}