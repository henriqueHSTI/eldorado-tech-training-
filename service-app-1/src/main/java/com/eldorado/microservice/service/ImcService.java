package com.eldorado.microservice.service;

import com.eldorado.microservice.domain.model.ImcEntity;
import com.eldorado.microservice.domain.repository.ImcRepository;
import com.eldorado.microservice.dto.ImcBaseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ImcService {

    private final ImcRepository imcRepository;

    private final ModelMapper modelMapper;

    public ImcBaseDto saveImc(ImcBaseDto imcBaseDto) {


        var imcEntity = modelMapper.map(imcBaseDto, ImcEntity.class);

        log.info("List -> {}", imcEntity);
        imcEntity.setCreatedAt("JOSE");
        imcEntity.setOffsetDateTime(LocalDateTime.now());
        imcEntity.setId(UUID.randomUUID());

        var imcEntitySave = imcRepository.save(imcEntity);

        log.info("IMC SAVED WITH SUCESSEFUL {}", imcEntitySave);
        imcBaseDto.setId(imcEntitySave.getId());

        return imcBaseDto;
    }




}
