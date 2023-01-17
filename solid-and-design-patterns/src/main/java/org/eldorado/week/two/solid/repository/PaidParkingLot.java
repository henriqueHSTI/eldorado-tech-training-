package org.eldorado.week.two.solid.repository;

import org.eldorado.week.two.solid.repository.model.Car;

public interface PaidParkingLot extends ParkingLot {

    void payParkingLot(Car car);
    double calculateRate(Car car);

}
