package com.naihe.service.impl;

import com.naihe.dao.MyDao;
import com.naihe.domain.Account;
import com.naihe.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MyService")
public class MyServiceImpl implements MyService {

    @Autowired
    private MyDao myDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询");
        return myDao.findAll();
    }
}
