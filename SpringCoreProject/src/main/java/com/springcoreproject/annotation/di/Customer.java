package com.springcoreproject.annotation.di;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Log4j2
@Component

public class Customer {
    private String name;
    private int age;
    private String email;

    public void getCustomer(){
        log.info("Customer Name : " + name);
        log.info("Customer Age : " + age);
        log.info("Customer Email : " + email);

    }
}
