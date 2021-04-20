package com.example.restapitest.service;

import com.example.restapitest.entity.User;

public interface UserService {

    public User getUserById(Integer id);

    public User saveUser(User user);
}
