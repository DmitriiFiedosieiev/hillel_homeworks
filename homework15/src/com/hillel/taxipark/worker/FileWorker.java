package com.hillel.taxipark.worker;

import com.hillel.taxipark.model.Bus;
import com.hillel.taxipark.model.Car;
import com.hillel.taxipark.model.PassengerCar;
import com.hillel.taxipark.model.Truck;

import java.io.*;
import java.util.ArrayList;

public class FileWorker {

    private String initialPath;
    private String finalPath;
    private String fileString;

    public FileWorker(String initialPath, String finalPath) {
        this.initialPath = initialPath;
        this.finalPath = finalPath;
    }

    public ArrayList<Car> readFile() {
        try(FileInputStream inputStream = new FileInputStream(initialPath)) {
            byte[] bytesArray = inputStream.readAllBytes();
            fileString = new String(bytesArray);
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return createCars();
    }

    public void writeFile(Car[] cars) {
        try(FileOutputStream outputStream = new FileOutputStream(finalPath)) {
            for (Car car : cars) {
                fileString = car.toString();
                byte[] bytesArray = fileString.getBytes();
                outputStream.write(bytesArray);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private ArrayList<Car> createCars() {
        ArrayList<Car> result = new ArrayList<>();
        String[] linesArray = fileString.split(";\r\n");
        for (String line : linesArray) {
            String[] elementsArray = line.split(",");
            switch (elementsArray[0]) {
                case "Bus": result.add(new Bus(elementsArray[1], Double.parseDouble(elementsArray[2]),
                        Double.parseDouble(elementsArray[3]),
                        Integer.parseInt(elementsArray[4]), Integer.parseInt(elementsArray[5])));
                    break;
                case "Truck": result.add(new Truck(elementsArray[1], Double.parseDouble(elementsArray[2]),
                        Double.parseDouble(elementsArray[3]),
                        Integer.parseInt(elementsArray[4]), Integer.parseInt(elementsArray[5])));
                    break;
                case "PassengerCar": result.add(new PassengerCar(elementsArray[1], Double.parseDouble(elementsArray[2]),
                        Double.parseDouble(elementsArray[3]),
                        Integer.parseInt(elementsArray[4]), elementsArray[5]));
                    break;
            }
        }
        return result;
    }
}
