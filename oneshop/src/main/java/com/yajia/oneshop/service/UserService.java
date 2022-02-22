package com.yajia.oneshop.service;

import com.yajia.oneshop.domain.User;

public interface UserService {
    public User login(String loginName, String password);
}
