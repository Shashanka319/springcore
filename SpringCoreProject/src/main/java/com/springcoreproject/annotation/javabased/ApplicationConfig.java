package com.springcoreproject.annotation.javabased;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@Log4j2
public class ApplicationConfig{
    @Bean("currentDate")
    public Date currentDate(){
        return new Date();
    }


}