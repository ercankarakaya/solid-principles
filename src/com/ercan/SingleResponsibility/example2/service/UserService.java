package com.ercan.SingleResponsibility.example2.service;

import com.ercan.SingleResponsibility.example2.entity.User;

import java.util.List;

public interface UserService {
    public List<User> save(User user);
    public List<User> findAll();
}
