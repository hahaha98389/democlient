package com.example.democlient.controller;

import com.example.democlient.bean.Person;
import com.example.democlient.service.interfaces.PersonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FeignController")
public class FeignController {
    @Autowired
    PersonInterface personInterface;

    @GetMapping("/getOnePerson")
    public Person getOnePerson(){
       return personInterface.getPerson();
    }



}
