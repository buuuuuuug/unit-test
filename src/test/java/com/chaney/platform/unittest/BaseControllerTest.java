package com.chaney.platform.unittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseControllerTest extends AbstractIntegrationTest{

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void simpleTest() {
        String fooResource = "/hello";

        String s = restTemplate.getForObject(fooResource, String.class);

        assertThat(s).isEqualTo("Hello World");
    }
}