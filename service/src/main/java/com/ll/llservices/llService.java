package com.ll.llservices;

import com.ll.persistance.CaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("llService")
public class llService {

    @Autowired
    CaseDto dto;

    public String sayHello(){
        return dto.sayHello();
    }

    public void printHello(){
        System.out.println("Hello Printing");
    }

    public void setDto(CaseDto dto) {
        this.dto = dto;
    }

    public CaseDto getDto() {
        return dto;
    }
}
