package com.yajia.oneshop.dao;

import com.yajia.oneshop.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    public User selectByLoginNameAndPassword(@Param("loginName") String loginName, @Param("userpass") String userpass);
}
