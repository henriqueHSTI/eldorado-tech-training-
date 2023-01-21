package com.eldorado.microservice.controller;

import com.eldorado.microservice.dto.ClientImcDto;
import com.eldorado.microservice.service.ClientImcService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client-imc")
@Slf4j
@RequiredArgsConstructor
public class ClientImcController {

    private final ClientImcService clientImcService;

    @PostMapping
    public ResponseEntity<ClientImcDto> saveImc(@RequestBody ClientImcDto clientImcDto) {
        log.info("Received Client IMC {} ", clientImcDto);
        return ResponseEntity.ok(clientImcService.saveImc(clientImcDto));
    }


}
