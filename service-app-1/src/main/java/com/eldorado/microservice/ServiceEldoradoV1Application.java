package com.eldorado.microservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@Slf4j
public class ServiceEldoradoV1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEldoradoV1Application.class, args);
    }

}
