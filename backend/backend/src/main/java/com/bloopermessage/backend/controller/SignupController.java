package com.bloopermessage.backend.controller;
import com.bloopermessage.backend.entity.User;
import com.bloopermessage.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/signup-user")
    public User addUser(@RequestBody User userToAdd) {
        return userRepository.save(userToAdd);
    }

}
