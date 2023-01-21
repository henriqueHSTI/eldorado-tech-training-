package com.eldorado.microservice.domain.repository;

import com.eldorado.microservice.domain.model.ClientEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientRepository extends MongoRepository<ClientEntity, UUID> {
}
