package com.eldorado.microservice.service;

import com.eldorado.microservice.domain.model.ImcEntity;
import com.eldorado.microservice.domain.repository.ImcRepository;
import com.eldorado.microservice.dto.ImcBaseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ImcService {

    private final ImcRepository imcRepository;

    public ImcBaseDto saveImc(ImcBaseDto imcBaseDto) {

        var imcEntity = ImcEntity.builder()
                .id(UUID.randomUUID())
                .offsetDateTime(LocalDateTime.now())
                .createdAt("JOSE SILVA")
                .bodyMass(imcBaseDto.getBodyMass()).
                classification(imcBaseDto.getClassification())
                .obesityLevel(imcBaseDto.getObesityLevel()).build();

        var imcEntitySave = imcRepository.save(imcEntity);

        log.info("IMC SAVED WITH SUCESSEFUL {}", imcEntitySave);
        imcBaseDto.setId(imcEntitySave.getId());

        return imcBaseDto;
    }


}
