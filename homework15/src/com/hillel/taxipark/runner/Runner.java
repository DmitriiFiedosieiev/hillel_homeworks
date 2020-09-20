package com.hillel.taxipark.runner;

import com.hillel.taxipark.model.Bus;
import com.hillel.taxipark.model.Car;
import com.hillel.taxipark.model.PassengerCar;
import com.hillel.taxipark.model.Truck;
import com.hillel.taxipark.worker.CarPark;

import java.util.ArrayList;

public class Runner {


    public static void main(String[] args) {
       ArrayList<Car> cars = new ArrayList<>();
       cars.add(new PassengerCar("Bmw" , 120000, 160.0, 24, "Black"));
       cars.add(new Truck("Scania", 200000, 80, 18, 10));
       cars.add(new Bus("Mercedes", 100000, 60, 16, 8));

       CarPark carPark = new CarPark(cars);
       System.out.println(carPark.getCarsBySpeed(70,170));
       System.out.println();
       System.out.println(carPark);
    }
}
