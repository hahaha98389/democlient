package com.example.democlient.service.impl;

import com.example.democlient.bean.Person;
import com.example.democlient.service.fallback.FallBack;
import com.example.democlient.service.interfaces.PersonInterface;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonImpl extends FallBack implements PersonInterface {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "getPersonFallBack")//指定熔断时调用的方法
    @Override
    public Person getPerson() {

        //这里的url必须要写http://
        ResponseEntity<Person> responseEntity = restTemplate.getForEntity("http://localhost:8002/Person/getPerson",Person.class);
        Person person = responseEntity.getBody();
        return person;
    }
}
