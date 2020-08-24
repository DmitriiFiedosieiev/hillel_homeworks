package com.hillel.flowersworker;

import com.hillel.model.Bouquet;
import com.hillel.utils.ArrayUtils;

public class FlowerShop {

    private Bouquet[] bouquets;

    public FlowerShop() {
        this.bouquets = new Bouquet[0];
    }

    public void addBouquet(Bouquet addedBouquet) {
        bouquets = ArrayUtils.increaseBouquetArray(bouquets);
        bouquets[bouquets.length - 1] = addedBouquet;
    }

    @Override
    public String toString() {
        String result = "";
        for (Bouquet bouquet: bouquets) {
            result += bouquet;
        }
        return result;
    }

    public Bouquet[] getBouquets() {
        return bouquets;
    }

    public void setBouquets(Bouquet[] bouquets) {
        this.bouquets = bouquets;
    }
}
