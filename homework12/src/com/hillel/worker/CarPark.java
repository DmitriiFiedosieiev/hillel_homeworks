package com.hillel.worker;

import com.hillel.model.Car;

import java.util.Arrays;

import static com.hillel.utils.ArrayUtils.*;

public class CarPark implements com.hillel.function.ParkFunctions {


    private Car[] cars;

    public CarPark(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public double sumPrice() {
        double sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        return sum;
    }

    @Override
    public void sortByConsumption() {
        Car temp;
        for (int i = 0; i < cars.length; i++){
            for (int j = 1; j < cars.length; j++) {
                if (cars[j - 1].getFuelConsumption() > cars[j].getFuelConsumption()) {
                    temp = cars[j - 1];
                    cars[j - 1] = cars[j];
                    cars[j] = temp;
                }
            }
        }
    }

    @Override
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
