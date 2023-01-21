package com.eldorado.microservice;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
@Slf4j
class ServiceEldoradoV1ApplicationTests {

    @Test
     void contextLoads() {
        log.info("{}", UUID.randomUUID());

    }

}
