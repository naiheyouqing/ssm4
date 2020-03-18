package com.naihe.test;

import com.naihe.service.MyService;
import com.naihe.service.impl.MyServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void testSpring(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        MyService bean =(MyService) ac.getBean("MyService");
        bean.findAll();
    }
}
