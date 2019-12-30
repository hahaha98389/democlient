package com.example.democlient.controller.interfaces;

import com.example.democlient.bean.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "demoserver")
public interface PersonInterface {
    @GetMapping("/getPerson")
    Person getPerson();
}
