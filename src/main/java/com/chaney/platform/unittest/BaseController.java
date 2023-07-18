package com.chaney.platform.unittest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
