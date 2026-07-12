package com.springcoreproject.annotation.di;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Getter
@Setter

@Log4j2@Component("driver")

public class Driver {
    String name="shashank";
    int age =22;
    // Match by qualifier
    @Qualifier("honda")
    @Autowired
    Vehicle vehicle;
    public void getDriver(){
        log.info("Driver Name:{}",name);
        log.info("Driver Age:{}",age);
        if(vehicle!=null){
            vehicle.engine();
        }
    }


}
