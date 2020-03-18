package com.naihe.service.impl;

import com.naihe.dao.UserDao;
import com.naihe.domain.User;
import com.naihe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkLogin(User user) {

        return userDao.checkUser(user);
    }
}
