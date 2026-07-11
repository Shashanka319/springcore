package com.springcoreproject.annotation.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject.annotation.bean");
        Product product = context.getBean("product", Product.class);
        product.getProduct();

        ProductDAO productDAO = context.getBean("productDAO", ProductDAO.class);
        productDAO.getProductDAO();

        ProductService productService = context.getBean("productService", ProductService.class);
        productService.getProductService();

    }
}
