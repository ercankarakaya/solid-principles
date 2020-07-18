package com.ercan.SingleResponsibility.example2.dao;

import com.ercan.SingleResponsibility.example2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    List<User> list=new ArrayList<>();

    @Override
    public List<User> save(User user) {

        list.add(user);
        return list;
    }

    @Override
    public List<User> findAll() {
        return list;
    }
}
