package org.eldorado.week.two.solid.repository.model;

public interface ParkingLot {

    void parkCar();

    void leaveParting();

    void getCapacity();    // Retornar capacidade de carros

    double calculateRate(Car car); // Retornar o preço com base no número de horas

    void payParkingLot(Car car);
}
