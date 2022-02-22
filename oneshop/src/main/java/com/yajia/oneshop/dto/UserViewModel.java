package com.yajia.oneshop.dto;

import com.yajia.oneshop.domain.User;

public class UserViewModel extends User {

    private String loginName;

    private String rePassword;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }
}
