package com.eldorado.microservice.domain.repository;

import com.eldorado.microservice.domain.model.ClientImcEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ClientImcRepository extends MongoRepository<ClientImcEntity, UUID> {

    List<ClientImcEntity> findByClientId(UUID clientId);

}
