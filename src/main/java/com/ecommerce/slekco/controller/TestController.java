package com.ecommerce.slekco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "SLEKCO Backend is Running Successfully! 🚀";
    }

}