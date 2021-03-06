package com.example.restapitest.service;

import com.example.restapitest.entity.User;
import com.example.restapitest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }
}
