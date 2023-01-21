package com.eldorado.microservice.domain.model;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("client-imc")
public class ClientImcEntity {
    @Id
    private UUID id;
    @NonNull
    private UUID clientId;
    @NonNull
    private double height;
    @NonNull
    private double weight;
    private double bodyMass;
    @NonNull
    private LocalDate dateOfMeasure;
    private ImcEntity imcEntity;

}
