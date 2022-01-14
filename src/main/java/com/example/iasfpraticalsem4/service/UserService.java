package com.example.iasfpraticalsem4.service;

import com.example.iasfpraticalsem4.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

        User save(User user);

        List<User> findAll();

        Optional<User> findById(int id);

        boolean delete(User user);

        User update( User user);

}
