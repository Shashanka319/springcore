package com.springcoreproject.annotation.javabased;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;



import java.util.Date;
@Log4j2

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject.annotation.javabased");
        Date currentDate =(Date) context.getBean("currentDate",Date.class);
        log.info("Current Date:"+currentDate);




    }
}
