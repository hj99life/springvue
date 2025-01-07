package com.hj99life.springvue.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping("/")
    public String home(){
        return "Data 준비중.. ";
    }
}
