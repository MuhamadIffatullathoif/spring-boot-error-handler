package com.example.springboot.error.services;

import com.example.springboot.error.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> list();
    public User getById(Integer id);
    public Optional<User> optionalGetById(Integer id);

}
