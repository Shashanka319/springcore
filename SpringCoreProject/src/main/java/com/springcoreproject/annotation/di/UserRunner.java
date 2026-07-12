package com.springcoreproject.annotation.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject.annotation.di");
        User user =(User) context.getBean("user",User.class);
        user.setUsername("Shashank");
        user.setAge(22);
        user.setAccNo(1560108012106L);
        user.getUser();
    }
}
