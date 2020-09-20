package com.hillel.taxipark.model;

public class PassengerCar extends Car {

    private String color;

    public PassengerCar(String brand, double price, double maxSpeed, int fuelConsumption, String color) {
        super(brand, price, maxSpeed, fuelConsumption);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "," + color + ";\r\n";
    }
}
