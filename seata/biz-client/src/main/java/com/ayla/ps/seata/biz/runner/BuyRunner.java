package com.ayla.ps.seata.biz.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author PS
 * @description
 * @date 2020/7/7 3:29 PM
 */
@Component
@Slf4j
public class BuyRunner implements CommandLineRunner {
    public void run(String... args) throws Exception {
        log.info("Test log file name and path.");
    }
}
