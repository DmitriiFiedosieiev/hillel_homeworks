package com.hillel.utils;

import com.hillel.model.Accessory;
import com.hillel.model.Bouquet;
import com.hillel.model.Flower;

public class ArrayUtils {

    public static Flower[] increaseFlowerArray (Flower[] existingArray) {
        Flower[] tempArray = new Flower[existingArray.length + 1];
        for (int i = 0; i < existingArray.length; i++)
            tempArray[i] = existingArray[i];
        return  tempArray;
    }

    public static Accessory[] increaseAccessoryArray (Accessory[] existingArray) {
        Accessory[] tempArray = new Accessory[existingArray.length + 1];
        for (int i = 0; i < existingArray.length; i++)
            tempArray[i] = existingArray[i];
        return  tempArray;
    }

    public static Bouquet[] increaseBouquetArray (Bouquet[] existingArray) {
        Bouquet[] tempArray = new Bouquet[existingArray.length + 1];
        for (int i = 0; i < existingArray.length; i++)
            tempArray[i] = existingArray[i];
        return  tempArray;
    }
}
