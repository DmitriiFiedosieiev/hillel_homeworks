package com.hillel.model;

public class Flower {

    private String name;
    private int stemLength;
    private int daysOfLife;
    private double price;

    public Flower(String name, int stemLength, int daysOfLife, double price) {
        this.name = name;
        this.stemLength = stemLength;
        this.daysOfLife = daysOfLife;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + stemLength + " " + daysOfLife + " " + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getDaysOfLife() {
        return daysOfLife;
    }

    public void setDaysOfLife(int daysOfLife) {
        this.daysOfLife = daysOfLife;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
