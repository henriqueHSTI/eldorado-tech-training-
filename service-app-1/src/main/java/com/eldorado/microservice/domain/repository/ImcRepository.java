package com.eldorado.microservice.domain.repository;

import com.eldorado.microservice.domain.model.ImcEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImcRepository extends MongoRepository<ImcEntity, UUID> {

    ImcEntity findByClassificationAndId(String classifcation, UUID id);
}
