package com.example.JOBNOVA.JOBNOVA.service;

import com.example.JOBNOVA.JOBNOVA.model.User;
import com.example.JOBNOVA.JOBNOVA.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    /*
     * Save user
     */
    public User save(User user) {
        return repo.save(user);
    }

    /*
     * Find user by username
     */
    public Optional<User> findByUsername(String username) {
        return repo.findByUsername(username);
    }

    /*
     * Find user by email
     */
    public Optional<User> findByEmail(String email) {
        return repo.findByEmail(email);
    }
}