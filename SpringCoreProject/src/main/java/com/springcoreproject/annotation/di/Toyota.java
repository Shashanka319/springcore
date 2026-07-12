package com.springcoreproject.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2@Component

public class Toyota implements Vehicle{

    @Override
    public void engine() {
        log.info("Toyota Engine is Started");
    }
}
