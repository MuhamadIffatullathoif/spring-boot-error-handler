package com.example.springboot.error.services;

import com.example.springboot.error.domain.User;

import java.util.List;

public interface UserService {
    public List<User> list();
    public User getById(Integer id);

}
