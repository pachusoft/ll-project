package com.example.controllers;

import com.ll.persistance.CaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaseController {

    @Autowired
    CaseDto dto;

    @RequestMapping("/hello")
    public String sayHello(){
        String msg = dto.sayHello();
        //Adding a comment
        //Adding another comment
        //Release1 comment
        return msg;
    }
}
