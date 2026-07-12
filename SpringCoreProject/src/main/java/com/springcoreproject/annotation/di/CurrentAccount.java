package com.springcoreproject.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2@Component

public class CurrentAccount implements Bank {

    @Override
    public void transaction() {
        log.info("Transaction procees Starting through Current Account");
    }
}
