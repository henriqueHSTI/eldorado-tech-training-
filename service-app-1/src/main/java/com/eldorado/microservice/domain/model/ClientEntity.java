package com.eldorado.microservice.domain.model;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("client")
public class ClientEntity {
    @Id
    private UUID id;
    @NonNull
    private String name;
    private String age;
    @NonNull
    private char gender;
    @NonNull
    private String documentNumber;
    @NonNull
    private LocalDate dateOfBorn;
    @NonNull
    private short frequencyAmount;
    @NonNull
    private String phone;
    @NonNull
    private String address;


}
