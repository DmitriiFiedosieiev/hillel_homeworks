package com.hillel.homework9.carHomework.carModels;

public class Bus extends Car {

    private double height;

    public Bus(String brand, double price, double maxSpeed, int fuelConsumption, double height) {
        super(brand, price, maxSpeed, fuelConsumption);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " Height: " + height;
    }
}
