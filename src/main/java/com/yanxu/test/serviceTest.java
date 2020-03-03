package com.yanxu.test;

import com.yanxu.service.IThree_code_groud_service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class serviceTest {

    @Test
    public void serviceTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IThree_code_groud_service iThree_code_groud_service = (IThree_code_groud_service) ac.getBean("iThree_code_groud_service");

        iThree_code_groud_service.findAll();
    }

    @Test
    public void jis(){
        System.out.println("sdfsdf");
    }
}
