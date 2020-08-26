package com.hillel.container;

import com.hillel.utils.ArrayUtils;

import java.util.Arrays;

public class IntContainer {

    private int[] container;
    int count;

    public IntContainer() {
        this.container = new int[0];
    }

    synchronized public void fillContainer(int[] array, int amountOfElements) {
        count = container.length - amountOfElements;
        container = ArrayUtils.increaseArray(container, amountOfElements);
        System.arraycopy(array, 0, container, container.length - amountOfElements, amountOfElements);
    }

    @Override
    public String toString() {
        return Arrays.toString(container);
    }
}
