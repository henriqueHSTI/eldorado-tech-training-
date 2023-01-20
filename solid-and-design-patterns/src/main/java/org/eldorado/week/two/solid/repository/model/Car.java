package org.eldorado.week.two.solid.repository.model;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Car {
    String model;
    String collor;
    int year;
    int enginePower;
    String licencePlate;
    int numberDoor;

    List<String> itens;

    int maxVelocity;
}
