package com.example.democlient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class DemoclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoclientApplication.class, args);
    }
    @Bean
    public RestTemplate getBean(){
        return new RestTemplate();
    }

}
