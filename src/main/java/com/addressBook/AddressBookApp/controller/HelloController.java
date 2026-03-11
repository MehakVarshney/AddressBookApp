package com.addressBook.AddressBookApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @GetMapping("/")
    public String hello()
    {
        return "Welcome to Address Book App";
    }

}