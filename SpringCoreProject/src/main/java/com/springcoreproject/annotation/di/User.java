package com.springcoreproject.annotation.di;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Log4j2@Getter@Setter

public class User {
    private  String username;
    private int age;
    private long accNo;
    @Autowired
    private Bank savingAccount;//match by name
    public void getUser(){
        log.info("Execute the user Information");
        log.info("User Name:{}",username);
        log.info("User Age:{}",age);
        log.info("User Acc No:{}",accNo);
        if(savingAccount!=null){
            savingAccount.transaction();
        }
    }
}
