package com.eldorado.microservice.service;

import com.eldorado.microservice.domain.model.ClientEntity;
import com.eldorado.microservice.domain.model.ClientImcEntity;
import com.eldorado.microservice.domain.repository.ClientImcRepository;
import com.eldorado.microservice.domain.repository.ClientRepository;
import com.eldorado.microservice.dto.ClientDto;
import com.eldorado.microservice.dto.CustomImcList;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.groupingBy;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClientService {

    private final ClientRepository clientRepository;
    private final ClientImcRepository clientImcRepository;

    private final ModelMapper modelMapper;

    public ClientDto saveClient(ClientDto clientDto) {

        clientDto.setId(UUID.randomUUID());
        var clientEntity = modelMapper.map(clientDto, ClientEntity.class);

        var clientSaveEntity = clientRepository.save(clientEntity);

        log.info("IMC SAVED WITH SUCESSEFUL {}", clientSaveEntity);
        clientDto.setId(clientSaveEntity.getId());

        return clientDto;
    }


    @SneakyThrows
    public ClientDto getClientImc(UUID id) {
        var client = clientRepository.findById(id)
                .orElseThrow(() -> new Exception("NOT FOUND"));

        var clientImcs = clientImcRepository.findByClientId(id);

        var clientCustom = modelMapper.map(clientImcs, CustomImcList.class);

        var clientDto = modelMapper.map(client, ClientDto.class);
        clientDto.setClientImcs(clientCustom);

        clientDto.setHasChange(verifyChangeImc(clientImcs));

        return clientDto;
    }

    private boolean verifyChangeImc(List<ClientImcEntity> clientImcs) {

        return clientImcs.
                stream()
                .collect(groupingBy(client ->
                        client.getImcEntity().
                                getClassification())).size() > 1;

    }


}
