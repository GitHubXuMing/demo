package com.company.service;

import com.company.dao.UserDao;
import com.company.dao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User findById(Integer userId) {
        return userDao.findById(userId,new Random().nextDouble());
    }
}
