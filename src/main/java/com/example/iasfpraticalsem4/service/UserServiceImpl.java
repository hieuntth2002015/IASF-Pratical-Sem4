package com.example.iasfpraticalsem4.service;

import com.example.iasfpraticalsem4.Entity.User;
import com.example.iasfpraticalsem4.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean delete(User user) {
        userRepository.delete(user);
        return true;
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }
}
