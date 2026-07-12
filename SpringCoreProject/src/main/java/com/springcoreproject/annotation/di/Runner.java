package com.springcoreproject.annotation.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject.annotation.di");
        Account account = context.getBean("account",Account.class);
        account.setName("Canara Bank");
        account.setAccNo(1560108012106L);
        account.setBalance(5000);
        account.getCustomer().setName("Shashank K");
        account.getCustomer().setAge(22);
        account.getCustomer().setEmail("sharathshashank1986@gmail.com");
        account.getAccount();
    }
}
