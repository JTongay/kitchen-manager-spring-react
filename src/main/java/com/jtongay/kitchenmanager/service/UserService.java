package com.jtongay.kitchenmanager.service;

import com.jtongay.kitchenmanager.model.UserModel;
import com.jtongay.kitchenmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public List<UserModel> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
