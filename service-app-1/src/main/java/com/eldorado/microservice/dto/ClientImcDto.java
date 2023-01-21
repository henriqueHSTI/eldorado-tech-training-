package com.eldorado.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientImcDto {
    @Id
    private UUID id;
    private UUID clientId;
    private double height;
    private double weight;
    private LocalDate dateOfMeasure;

}
