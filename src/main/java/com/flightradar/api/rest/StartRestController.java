package com.flightradar.api.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartRestController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello World!";
    }

}