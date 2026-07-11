package com.springcoreproject.annotation.bean;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public void getProductService(){
        System.out.println("Execute the getProductService method in ProductService");
    }

}
