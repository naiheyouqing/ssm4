package com.naihe.controller;

import com.naihe.domain.Account;
import com.naihe.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class MyController {

    @Autowired
    private MyService myService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层成功");
        List<Account> users = myService.findAll();
        for (Account user: users){
            System.out.println(user);
        }
        model.addAttribute("users",users);
        return "list";
    }


}
