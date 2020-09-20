package com.hillel.taxipark.model;

public class Bus extends Car {

    private int numbersOfPassengers;

    public Bus(String brand, double price, double maxSpeed, int fuelConsumption, int numbersOfPassengers) {
        super(brand, price, maxSpeed, fuelConsumption);
        this.numbersOfPassengers = numbersOfPassengers;
    }

    public double getNumbersOfPassengers() {
        return numbersOfPassengers;
    }

    public void setNumbersOfPassengers(int numbersOfPassengers) {
        this.numbersOfPassengers = numbersOfPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + "," + numbersOfPassengers + ";\r\n";
    }
}
