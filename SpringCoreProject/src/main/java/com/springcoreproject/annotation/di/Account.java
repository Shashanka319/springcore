package com.springcoreproject.annotation.di;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Log4j2
@Component("account")

public class Account {
    private String name;
    private long accNo;
    private double balance;
    //Match by type
    @Autowired
    Customer customer;

    public void getAccount() {
        if(customer!=null){
            customer.getCustomer();
        }else {
            log.info("Customer info is Null check once");
        }
        log.info("Account name is {}", name);
        log.info("Account Number is {}",accNo);
        log.info("Account balance is {}", balance);


    }

}
