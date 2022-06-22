package com.orient.azercell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {

    @GetMapping("/test")
    public String test()
    {
        return "Hello!";
    }

    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome!";
    }
}
