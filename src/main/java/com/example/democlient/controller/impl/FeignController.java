package com.example.democlient.controller.impl;

import com.example.democlient.bean.Person;
import com.example.democlient.controller.interfaces.PersonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/FeignController")
public class FeignController {
    @Autowired
    PersonInterface personInterface;

    @GetMapping("/getOnePerson")
    public Person getOnePerson(){
       return personInterface.getPerson();
    }



}
