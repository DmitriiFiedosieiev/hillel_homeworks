package com.hillel.utils;

public class ArrayUtils {

    public static int[] increaseArray(int[] array) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i < array.length; i ++) {
            result[i] = array[i];
        }
        return result;
    }

    public static int[] increaseArray(int[] array, int amountOfElements) {
        int[] result = new int[array.length + amountOfElements];
        for (int i = 0; i < array.length; i ++) {
            result[i] = array[i];
        }
        return result;
    }
}
