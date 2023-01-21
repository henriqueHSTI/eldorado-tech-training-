package com.eldorado.microservice.controller;

import com.eldorado.microservice.dto.ClientDto;
import com.eldorado.microservice.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/client")
@Slf4j
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientDto> saveImc(@RequestBody ClientDto clientDto) {
        log.info("Received Client IMC {} ", clientDto);
        return ResponseEntity.ok(clientService.saveClient(clientDto));
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<ClientDto> getImc(@PathVariable UUID clientId) {
        return ResponseEntity.ok(clientService.getClientImc(clientId));
    }

}
