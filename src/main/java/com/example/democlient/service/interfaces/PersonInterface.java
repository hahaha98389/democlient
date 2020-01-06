package com.example.democlient.service.interfaces;

import com.example.democlient.bean.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "demoserver")
public interface PersonInterface {
    @GetMapping("/getPerson")
    Person getPerson();
}
