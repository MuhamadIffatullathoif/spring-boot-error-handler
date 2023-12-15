package com.example.springboot.error.services;

import com.example.springboot.error.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private final List<User> list;

    public UserServiceImpl() {
        this.list = new ArrayList<>();
        this.list.add(new User(1, "name 1","lastName 1"));
        this.list.add(new User(2, "name 2","lastName 2"));
        this.list.add(new User(3, "name 3","lastName 3"));
        this.list.add(new User(4, "name 4","lastName 4"));
        this.list.add(new User(5, "name 5","lastName 5"));
        this.list.add(new User(6, "name 6","lastName 6"));
        this.list.add(new User(7, "name 7","lastName 7"));
    }

    @Override
    public List<User> list() {
        return this.list;
    }

    @Override
    public User getById(Integer id) {
        User result = null;
        for (User user : this.list) {
            if(user.getId().equals(id)) {
                result = user;
                break;
            }
        }
        return result;
    }

    @Override
    public Optional<User> optionalGetById(Integer id) {
        User user = this.getById(id);
        return Optional.ofNullable(user);
    }
}
