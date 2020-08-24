package com.hillel.model;

import com.hillel.exception.NegativeValueOfStemException;
import com.hillel.utils.ArrayUtils;

import java.util.Arrays;

public class Bouquet {

    private Flower[] flowers;
    private Accessory[] accessories;

    public Bouquet(Flower[] flowers, Accessory[] accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public double getPrice() {
        double sumFlowerPrice = 0;
        double sumAccessoryPrice = 0;
        for(Flower flower : flowers){
            sumFlowerPrice += flower.getPrice();
        }
        for (Accessory accessory : accessories) {
            sumAccessoryPrice += accessory.getPrice();
        }
        return sumFlowerPrice + sumAccessoryPrice;
    }

    public void addFlower(Flower addedFlower) {
        flowers = ArrayUtils.increaseFlowerArray(flowers);
        flowers[flowers.length - 1] = addedFlower;
    }

    public void addAccessory(Accessory addedAccessory) {
        accessories = ArrayUtils.increaseAccessoryArray(accessories);
        accessories[accessories.length - 1] = addedAccessory;
    }

    public void sortFlowersByDaysOfLife() {
        Flower temp;
        for (int i = 0; i < flowers.length; i++) {
            for (int j = 1; j < flowers.length; j++)
                if (flowers[j].getDaysOfLife() > flowers[j].getDaysOfLife()){
                    temp = flowers[j - 1];
                    flowers[j - 1] = flowers[j];
                    flowers[j] = temp;
                }
        }
    }

    public Flower[] findFlowerByStemLength(int min, int max) throws NegativeValueOfStemException {
        if (min < 0 || max < 0){
            throw new NegativeValueOfStemException(min,max);
        }
        Flower[] result = new Flower[0];
        for (int i = 0; i < flowers.length; i++){
            if (flowers[i].getStemLength() >= min && flowers[i].getStemLength() <= max){
                result = ArrayUtils.increaseFlowerArray(result);
                result[i] = flowers[i];
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "\nFlowers: \n" + Arrays.toString(flowers) + "\nAccessories: " + Arrays.toString(accessories);
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Accessory[] getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessory[] accessories) {
        this.accessories = accessories;
    }
}
