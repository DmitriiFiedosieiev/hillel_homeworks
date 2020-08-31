package com.hillel.function;

import com.hillel.model.Car;

public interface ParkFunctions {

    public void sortByConsumption();

    public Car[] getCarsBySpeed(double minSpeed, double maxSpeed);

    public double sumPrice();

}
