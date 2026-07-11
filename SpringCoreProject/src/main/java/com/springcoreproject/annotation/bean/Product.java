package com.springcoreproject.annotation.bean;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Product {
    public Product() {
        log.info("Product Are Executing using Constructor");
    }
    public void getProduct() {
        log.info("Product Detailes Are Executing using Method");
    }
}
