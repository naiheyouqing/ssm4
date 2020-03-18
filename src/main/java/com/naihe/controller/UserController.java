package com.naihe.controller;

import com.naihe.domain.User;
import com.naihe.service.UserService;
import com.naihe.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }


    @RequestMapping(value = "/checkUser",method = RequestMethod.POST)
    public String checkUser(User user,Model model){
        System.out.println(user);
        User checkUser = userService.checkLogin(user);
        Msg msg = new Msg();
        msg.setError("用户名或密码错误");
        if(checkUser == null){
            model.addAttribute("msg",msg);
            return "login";
        }
        model.addAttribute("user",checkUser);
        return "userPage";
    }
}
