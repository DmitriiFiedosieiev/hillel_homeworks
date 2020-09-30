package com.hillel.runner;

import com.hillel.model.Bus;
import com.hillel.model.Car;
import com.hillel.model.PassengerCar;
import com.hillel.model.Truck;
import com.hillel.impl.MyCarPark;

import java.util.ArrayList;

public class Runner {


    public static void main(String[] args) {
       ArrayList<Car> cars = new ArrayList<>();
       cars.add(new PassengerCar("Bmw" , 120000, 160.0, 24, "Black"));
       cars.add(new Truck("Scania", 200000, 80, 18, 10));
       cars.add(new Bus("Mercedes", 100000, 60, 16, 8));

       MyCarPark carPark = new MyCarPark(cars);
        System.out.println(carPark);
        System.out.println();
        ArrayList<Car> filtered = (ArrayList<Car>) carPark.getCarsBySpeed(70, 100);
        System.out.println(filtered);
    }
}
