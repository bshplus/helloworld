package com.bshplus.helloworld.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hello")
    public String getHello() {
        return "hello" + (new Date());
    }

}
