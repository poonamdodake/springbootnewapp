package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String sayWelcome()
    {
        return "welcome to HDFC Bank";
    }
    @GetMapping("/address")
    public String address()
    {
        return "PIMPRI";
    }
    @GetMapping("/services")
    public String services()
    {
        return "cash withdrwal | cash deposite | loan faility";
    }

}
