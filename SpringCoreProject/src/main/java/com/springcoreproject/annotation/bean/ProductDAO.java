package com.springcoreproject.annotation.bean;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {
    public ProductDAO(){
        System.out.println("Execute the ProductDAO using Constuctor");
    }
    public void getProductDAO(){
        System.out.println("Execute the getProductDAO method in ProductDAO");
    }

}
