package com.ercan.SingleResponsibility.example2.service;

import com.ercan.SingleResponsibility.example2.dao.UserDAO;
import com.ercan.SingleResponsibility.example2.dao.UserDAOImpl;
import com.ercan.SingleResponsibility.example2.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    /*public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }*/

    public UserServiceImpl() {
       userDAO=new UserDAOImpl();
    }

    @Override
    public List<User> save(User user) {
        return userDAO.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
