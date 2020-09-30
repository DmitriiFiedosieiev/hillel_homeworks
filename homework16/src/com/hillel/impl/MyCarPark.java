package com.hillel.impl;

import com.hillel.model.Car;

import java.util.*;
import java.util.stream.Collectors;

public class MyCarPark implements com.hillel.carpark.CarPark<Car> {

    private List<Car> cars;

    public MyCarPark(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public double sumPrice() {
        return cars.stream().mapToDouble(Car::getPrice).reduce(0,(a,b) -> a+b);
    }

    @Override
    public void sortByConsumption() {
        cars = cars.stream().sorted(new FuelComparator<>()).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsBySpeed(double minSpeed, double maxSpeed) {
        return cars.stream().filter(a -> a.getMaxSpeed() > minSpeed && a.getMaxSpeed() < maxSpeed).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        String result = "";
        for (Car car : cars) {
            result += car;
         }
        return result;
    }
}
