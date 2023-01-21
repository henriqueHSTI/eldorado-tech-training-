package com.eldorado.microservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("imc-calculator")
public class ImcEntity {

    @Id
    private UUID id;
    private float bodyMass;
    private String classification;
    private String obesityLevel;
    private LocalDateTime offsetDateTime;
    private String createdAt;
}
