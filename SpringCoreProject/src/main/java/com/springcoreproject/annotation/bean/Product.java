package com.springcoreproject.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Product {
    Product(){
        log.info("Execute the product constructor");
    }
    public void getProduct(){
        log.info("Execute the product method");
    }

}
