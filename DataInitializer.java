package com.example.JOBNOVA.JOBNOVA.config;

import com.example.JOBNOVA.JOBNOVA.model.User;
import com.example.JOBNOVA.JOBNOVA.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner createDefaultUser(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder) {

        return args -> {

            if (userRepository
                    .findByUsername("hari")
                    .isEmpty()) {

                User user = User.builder()
                        .username("hari")
                        .password(
                                passwordEncoder.encode("1234")
                        )
                        .name("HariHaran")
                        .email("hari@gmail.com")
                        .build();

                userRepository.save(user);

                System.out.println(
                        "Default user created: hari / 1234"
                );
            }
        };
    }
}