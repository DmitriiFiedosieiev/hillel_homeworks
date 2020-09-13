package com.hillel.runner;

import com.hillel.model.Bus;
import com.hillel.model.Car;
import com.hillel.model.PassengerCar;
import com.hillel.model.Truck;
import com.hillel.worker.CarPark;
import com.hillel.worker.FileWorker;

public class Runner {


    public static void main(String[] args) {
       Car[] cars = new  Car[3];
       cars[0] = new PassengerCar("Bmw" , 120000, 160.0, 24, "Black");
       cars[1] = new Truck("Scania", 200000, 80, 18, 10);
       cars[2] = new Bus("Mercedes", 100000, 60, 16, 8);

       CarPark carPark = new CarPark(cars);
       carPark.sortByConsumptionLambda();
       System.out.println(carPark);
    }
}
