package com.example.dockerdemo.service;

import com.example.dockerdemo.entity.User;

import java.util.List;

public interface UserService {
    public int insert(User user);
    public int delete(User user);
    public int update(User user);
    public List<User> selectUser();
    public User findById(User user);
}
