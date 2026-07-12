package com.springcoreproject.annotation.javabased;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;
import java.util.Date;
@Log4j2

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject.annotation.javabased");
        Date currentDate = context.getBean("currentDate",Date.class);
        log.info("Current Date:"+currentDate);

        Calendar calendar = context.getBean("currentCalendar",Calendar.class);
        log.info("Current Calendar:"+calendar.getTime());
        log.info("Current Year:"+calendar.get(Calendar.YEAR));
        log.info("Current Month:"+calendar.get(Calendar.MONTH));
        log.info("Current Day:"+calendar.get(Calendar.DAY_OF_MONTH));
        log.info("Current Hour:"+calendar.get(Calendar.HOUR_OF_DAY));
        log.info("Current Minute:"+calendar.get(Calendar.MINUTE));
        log.info("Current Second:"+calendar.get(Calendar.SECOND));
        log.info("Current Millisecond:"+calendar.get(Calendar.MILLISECOND));




    }
}
