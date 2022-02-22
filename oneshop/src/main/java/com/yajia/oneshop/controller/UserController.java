package com.yajia.oneshop.controller;

import com.yajia.oneshop.domain.User;
import com.yajia.oneshop.dto.UserViewModel;
import com.yajia.oneshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ModelAndView login(UserViewModel user){

        User current_user =this.userService.login(user.getLoginName(),user.getRePassword());
        if(current_user !=null){
            return new ModelAndView("redirect:/index");
        }else {
            return new ModelAndView("login")
                    .addObject("msg", "用户名不存在或密码错误，或无权限！");
        }
    }


}
