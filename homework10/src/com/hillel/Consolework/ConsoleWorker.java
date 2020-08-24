package com.hillel.Consolework;

import com.hillel.exception.NegativeValueOfStemException;
import com.hillel.flowersworker.FlowerShop;
import com.hillel.model.Accessory;
import com.hillel.model.Bouquet;
import com.hillel.model.Flower;
import com.hillel.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleWorker {

    private FlowerShop flowerShop;
    private Scanner scanner;

    public ConsoleWorker(FlowerShop flowerShop) {
        this.flowerShop = flowerShop;
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();
        ConsoleWorker consoleWorker = new ConsoleWorker(flowerShop);
        consoleWorker.start();
        consoleWorker.stop();
    }

    public void start() {
        int choice;
        do {
            System.out.println("1. Create bouquet");
            System.out.println("2. Bouquet operations");
            System.out.println("3. Print current bouquets");
            System.out.println("0. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Bouquet createdBouquet = createBouquet();
                    flowerShop.addBouquet(createdBouquet);
                    System.out.println("Created bouquet price: " + createdBouquet.getPrice());
                    break;
                case 2:
                    bouquetChoosing();
                    break;
                case 3:
                    System.out.println(flowerShop);
                    break;
                case 0:
                    return;
            }
        } while (choice != 0);
    }

    private Bouquet createBouquet() {
        Flower[] flowers = new Flower[0];
        Accessory[] accessories = new Accessory[0];
        int choice;
        do {
            System.out.println("1. Create flowers: ");
            System.out.println("2. Create Accessories: ");
            System.out.println("0. Back ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    flowers = createFlowersArray();
                    break;
                case 2:
                    accessories = createAccessoriesArray();
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
        return new Bouquet(flowers, accessories);
    }

    private Flower[] createFlowersArray() {
        Flower[] flowers = new Flower[0];
        int choice;

        do {
            System.out.println("1. Create flower ");
            System.out.println("0. Back ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    flowers = ArrayUtils.increaseFlowerArray(flowers);
                    flowers[flowers.length - 1] = createFlower();
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
        return flowers;
    }

    private Flower createFlower() {
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Stem Length: ");
        int stemLength = scanner.nextInt();
        System.out.println("Days of life: ");
        int daysOfLife = scanner.nextInt();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
        return new Flower(name, stemLength, daysOfLife, price);
    }

    private Accessory[] createAccessoriesArray () {
        Accessory[] accessories = new Accessory[0];
        int choice;

        do {
            System.out.println("1. Create accessory ");
            System.out.println("0. Back ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    accessories = ArrayUtils.increaseAccessoryArray(accessories);
                    accessories[accessories.length - 1] = createAccessory();
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
        return accessories;
    }

    private Accessory createAccessory() {
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
        return new Accessory(name, price);
    }

    private void bouquetChoosing() {
        int choice;
        do {
            System.out.println(" Choose bouquet ");
            for (int i = 0; i < flowerShop.getBouquets().length; i++) {
                System.out.println(i + " . " + flowerShop.getBouquets()[i]);
            }
            System.out.println(" -1. Back");
            choice = scanner.nextInt();

            switch (choice){
                case -1:
                    return;
                default: bouquetOperations(flowerShop.getBouquets()[choice]);
            }
        } while (choice != -1);
    }

    private void bouquetOperations(Bouquet bouquet) {
        int choice;
        do {
            System.out.println("1. Sort flowers by days to live ");
            System.out.println("2. Find flowers by stem length ");
            System.out.println("3. Bouquet price ");
            System.out.println("4. Add flower ");
            System.out.println("5. Add accessory ");
            System.out.println("0. Back");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    bouquet.sortFlowersByDaysOfLife();
                    System.out.println(bouquet);
                    break;
                case 2:
                    findFlowerByStem(bouquet);
                case 3:
                    System.out.println(bouquet.getPrice());
                    break;
                case 4:
                    bouquet.addFlower(createFlower());
                    break;
                case 5:
                    bouquet.addAccessory(createAccessory());
                    break;
                case 0:
                    return;
            }
        } while (choice != 0);
    }

    private void findFlowerByStem(Bouquet bouquet) {
        System.out.println(" Min length: ");
        int min = scanner.nextInt();
        System.out.println(" Max length: ");
        int max = scanner.nextInt();

        try {
            Flower[] result = bouquet.findFlowerByStemLength(min, max);
            System.out.println(" Found flowers : " + Arrays.toString(result));
        } catch (NegativeValueOfStemException e){
            System.out.println(e.getMessage());;
        }
    }

    public void stop() {
        scanner.close();
    }
}
