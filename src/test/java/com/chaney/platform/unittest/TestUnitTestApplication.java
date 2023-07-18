package com.chaney.platform.unittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestUnitTestApplication {

    public static void main(String[] args) {
        SpringApplication.from(UnitTestApplication::main).with(TestUnitTestApplication.class).run(args);
    }

}
