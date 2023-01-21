package com.eldorado.microservice.service;

import com.eldorado.microservice.domain.model.ClientImcEntity;
import com.eldorado.microservice.domain.model.ImcEntity;
import com.eldorado.microservice.domain.repository.ClientImcRepository;
import com.eldorado.microservice.domain.repository.ImcRepository;
import com.eldorado.microservice.dto.ClientImcDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClientImcService {

    private final ClientImcRepository clientImcRepository;

    private final ImcRepository imcRepository;

    private final ModelMapper modelMapper;

    public ClientImcDto saveImc(ClientImcDto clientImcDto) {
        clientImcDto.setId(UUID.randomUUID());
        var clientImcEntity = modelMapper.map(clientImcDto, ClientImcEntity.class);
        var bodyMass = calculateBodyMass(clientImcDto);

        clientImcEntity.setImcEntity(calculateImc(clientImcDto, bodyMass));

        clientImcEntity.setBodyMass(bodyMass);

        clientImcEntity.setDateOfMeasure(
                Optional.of(clientImcDto.getDateOfMeasure())
                        .orElse(LocalDate.now()));

        var clientImcEntitySave = clientImcRepository.save(clientImcEntity);

        log.info("IMC SAVED WITH SUCESSEFUL {}", clientImcEntity);
        clientImcDto.setId(clientImcEntitySave.getId());

        return clientImcDto;
    }

    private ImcEntity calculateImc(ClientImcDto clientImcDto, Double bodyMass) {
        var imcs = imcRepository.findAll();
        Collections.sort(imcs);

        return imcs.stream().filter(imcs1 -> imcs1.getBodyMass() > bodyMass)
                .findFirst().orElse(ImcEntity.builder()
                        .classification("NOT DEFINED").build());


    }

    private Double calculateBodyMass(ClientImcDto clientImcDto) {
        return clientImcDto.getWeight() / Math.pow(clientImcDto.getHeight(), 2d);
    }


}
