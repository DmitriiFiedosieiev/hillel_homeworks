package com.hillel.worker;

import com.hillel.impl.FuelComparator;
import com.hillel.model.Car;

import java.util.Arrays;
import java.util.Comparator;

import static com.hillel.utils.ArrayUtils.*;

public class CarPark  {


    private Car[] cars;

    public CarPark(Car[] cars) {
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
        Arrays.sort(cars, new FuelComparator<>());
    }

    public void sortByConsumptionLambda() {
        Comparator<Car> comparator = (carOne, carTwo) -> Integer.compare(carOne.getFuelConsumption(), carTwo.getFuelConsumption());
        Arrays.sort(cars, comparator);
    }

    public void sortByConsumptionReference() {
        FuelComparator<Car> comparator = new FuelComparator();
        Arrays.sort(cars, comparator::compare);
    }

    public Car[] getCarsBySpeed(double minSpeed, double maxSpeed) {
        Car[] resultArray = new Car[0];
        int resultArrayIndex = 0;
        for (int i = 0; i < cars.length; i++) {
            double carMaxSpeed = cars[i].getMaxSpeed();
            if (carMaxSpeed > minSpeed && carMaxSpeed < maxSpeed) {
                resultArray = increaseCarArray(resultArray);
                resultArray[resultArrayIndex] = cars[i];
                resultArrayIndex++;
            }
        } return resultArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(cars);
    }
}
