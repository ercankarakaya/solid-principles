package com.ercan.SingleResponsibility.example2.dao;

import com.ercan.SingleResponsibility.example2.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> save(User user);
    public List<User> findAll();
}
