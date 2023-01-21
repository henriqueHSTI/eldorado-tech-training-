package com.eldorado.microservice.domain.repository;

import com.eldorado.microservice.domain.model.ImcEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ImcRepository extends MongoRepository<ImcEntity, UUID> {
}
