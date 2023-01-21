package com.eldorado.microservice.controller;

import com.eldorado.microservice.dto.ImcBaseDto;
import com.eldorado.microservice.service.ImcService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/imc-calculator")
@Slf4j
@RequiredArgsConstructor
public class ImcController {

    private final ImcService imcService;

    @PostMapping
    public ResponseEntity<ImcBaseDto> saveImc(@RequestBody ImcBaseDto imcBaseDto) {
        log.info("IMC Base {} ", imcBaseDto);
        return ResponseEntity.ok(imcService.saveImc(imcBaseDto));
    }

    @GetMapping
    public void getImcList() {
        log.warn("GET IMC Not IMPLEMENTED");
    }

    @PutMapping("/{imcId}")
    public void updateImc(@PathVariable UUID imcId) {
        log.warn("PUT IMC Not IMPLEMENTED {}", imcId);
    }

    @DeleteMapping("/{imcId}")
    public void deleteImc(@PathVariable UUID imcId) {
        log.warn("DELETE IMC Not IMPLEMENTED {}", imcId);
    }

    @GetMapping("/{imcId}")
    public void getImc(@PathVariable UUID imcId) {
        log.warn("GET IMC BY ID Not IMPLEMENTED {}", imcId);
    }


}
