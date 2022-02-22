package com.yajia.oneshop.service.impl;

import com.yajia.oneshop.domain.User;
import com.yajia.oneshop.dao.UserDao;
import com.yajia.oneshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
   private UserDao userDao;

    @Override
    public User login(String loginName, String userpass) {
        return this.userDao.selectByLoginNameAndPassword(loginName,userpass);
    }
}
