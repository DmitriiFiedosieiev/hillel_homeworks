package com.hillel.model;

public class Truck extends Car {

    private int weight;

    public Truck(String brand, double price, double maxSpeed, int fuelConsumption, int weight) {
        super(brand, price, maxSpeed, fuelConsumption);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "," + weight + ";\r\n";
    }
}
