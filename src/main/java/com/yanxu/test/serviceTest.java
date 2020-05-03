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

        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());


    }
}
