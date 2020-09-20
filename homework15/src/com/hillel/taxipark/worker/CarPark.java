package com.hillel.taxipark.worker;

import com.hillel.taxipark.impl.FuelComparator;
import com.hillel.taxipark.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarPark  {


    private ArrayList<Car> cars;

    public CarPark(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public double sumPrice() {
        double sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        return sum;
    }

    public void sortByConsumption() {
        Collections.sort(cars, new FuelComparator<>());
    }

    public void sortByConsumptionLambda() {
        Comparator<Car> comparator = (carOne, carTwo) -> Integer.compare(carOne.getFuelConsumption(), carTwo.getFuelConsumption());
        Collections.sort(cars, comparator);
    }

    public void sortByConsumptionReference() {
        Comparator<Car> comparator = new FuelComparator<>();
        Collections.sort(cars, comparator::compare);
    }

    public ArrayList<Car> getCarsBySpeed(double minSpeed, double maxSpeed) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            double carMaxSpeed = car.getMaxSpeed();
            if (carMaxSpeed > minSpeed && carMaxSpeed < maxSpeed) {
                result.add(car);
            }
        }
        return result;
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
