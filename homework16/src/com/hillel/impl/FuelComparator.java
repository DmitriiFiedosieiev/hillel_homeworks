package com.hillel.impl;

import com.hillel.model.Car;

import java.util.Comparator;

public class FuelComparator<T extends Car> implements Comparator<T> {

    @Override
    public int compare(T carOne, T carTwo) {
        return carOne.getFuelConsumption() - carTwo.getFuelConsumption();
    }
}
