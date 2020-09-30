package com.hillel.carpark;

import com.hillel.model.Car;

import java.util.List;

public interface CarPark<T extends Car> {

    double sumPrice();

    void sortByConsumption();

    List<Car> getCarsBySpeed(double min, double max);
}
