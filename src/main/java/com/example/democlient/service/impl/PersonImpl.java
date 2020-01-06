package com.example.democlient.service.impl;

import com.example.democlient.bean.Person;
import com.example.democlient.service.interfaces.PersonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonImpl implements PersonInterface {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Person getPerson() {

        //这里的url必须要写http://
        ResponseEntity<Person> responseEntity = restTemplate.getForEntity("http://localhost:8002/Person/getPerson",Person.class);
        Person person = responseEntity.getBody();
        return person;
    }
}
