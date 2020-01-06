package com.example.democlient.service.fallback;

import com.example.democlient.bean.Person;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FallBack {

    public Person getPersonFallBack(){
        log.info("error");
        return null;
    }
}
