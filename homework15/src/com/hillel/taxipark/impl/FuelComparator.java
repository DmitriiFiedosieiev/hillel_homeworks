package com.hillel.taxipark.impl;

import com.hillel.taxipark.model.Car;

import java.util.Comparator;

public class FuelComparator<T extends Car> implements Comparator<T> {

    @Override
    public int compare(T carOne, T carTwo) {
        return carOne.getFuelConsumption() - carTwo.getFuelConsumption();
    }
}
