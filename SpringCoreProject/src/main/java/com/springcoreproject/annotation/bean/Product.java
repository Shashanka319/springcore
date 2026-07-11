package com.springcoreproject.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component("product")

public class Product {
    public Product() {
        log.info("Product Are Executing using Constructor");
    }
    public void getProduct() {
        log.info("Product Detailes Are Executing using Method");
    }
}
