package com.example.controllers;

import com.ll.llservices.llService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaseController {

    @Autowired
    llService service;

    @RequestMapping("/hello")
    public String sayHello(){
        String msg = service.sayHello();
        //Adding a comment
        //Adding another comment
        //Release1 comment
        return msg;
    }

}
