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
public class ImcEntity implements Comparable<ImcEntity> {

    @Id
    private UUID id;
    private Double bodyMass;
    private String classification;
    private String obesityLevel;
    private LocalDateTime offsetDateTime;
    private String createdAt;

    @Override
    public int compareTo(ImcEntity o) {
        return bodyMass.compareTo(o.getBodyMass());
    }
}
