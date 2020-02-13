package com.example.bootmvc.thymeleaf.devtools.services;

import com.example.bootmvc.thymeleaf.devtools.entities.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}

