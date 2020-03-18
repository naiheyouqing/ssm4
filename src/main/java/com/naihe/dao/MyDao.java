package com.naihe.dao;

import com.naihe.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyDao {

    List<Account> findAll();
}
