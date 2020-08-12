package com.hillel.homework9.carHomework.carParkFunctions;

import com.hillel.homework9.carHomework.carModels.Car;

public interface CarPark {

    public void sortByConsumption();

    public Car[] getCarsBySpeed(double minSpeed, double maxSpeed);

    public double sumPrice();
}
