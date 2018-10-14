package com.fm.user.service.service.impl;

import com.fm.user.model.User;
import com.fm.user.service.UserService;
import com.fm.user.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        return userMapper.findById(id);
    }

    @GetMapping("/user")
    public List<User> listUsers() {
        return userMapper.findAll();
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable("id") Integer id) {
        userMapper.deleteById(id);
    }

    @PutMapping("/user")
    public void updateUser(@RequestBody User user) {
        userMapper.update(user);
    }

    @PostMapping("/user")
    public User insertUser(@RequestBody User user) {
        Integer userId = userMapper.insert(user);
        user.setId(userId);
        return user;
    }
}
