package com.raghu.rest.webservices.resfullwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String HelloWorld() {
        return "HelloWorld";
    }
}
