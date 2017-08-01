package com.powersoft.gtest.service;

import com.powersoft.gtest.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;


/**
 * Created by didi on 2017/8/1.
 */
public class UserServiceTest {
    @Test
    public void selectAll() throws Exception {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring/applicationContext.xml");
        UserService userService = (UserService)context.getBean("userService");
        List<User> users = userService.selectAll();
        for (User user : users) {
            System.out.println(user.toString());

        }
    }

}