package com.hillel.worker;

import com.hillel.model.Bus;
import com.hillel.model.Car;
import com.hillel.model.PassengerCar;
import com.hillel.model.Truck;

import java.io.*;

import static com.hillel.utils.ArrayUtils.*;

public class FileWorker {

    private String initialPath;
    private String finalPath;
    private String fileString;

    public FileWorker(String initialPath, String finalPath) {
        this.initialPath = initialPath;
        this.finalPath = finalPath;
    }

    public Car[] readFile() {
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

    private Car[] createCars() {
        Car[] result = new Car[0];
        String[] linesArray = fileString.split(";\r\n");
        for (String line : linesArray) {
            String[] elementsArray = line.split(",");
            switch (elementsArray[0]) {
                case "Bus": result = increaseCarArrayByOneItem(result,new Bus(elementsArray[1], Double.parseDouble(elementsArray[2]),
                        Double.parseDouble(elementsArray[3]),
                        Integer.parseInt(elementsArray[4]), Integer.parseInt(elementsArray[5])));
                    break;
                case "Truck": result = increaseCarArrayByOneItem(result, new Truck(elementsArray[1], Double.parseDouble(elementsArray[2]),
                        Double.parseDouble(elementsArray[3]),
                        Integer.parseInt(elementsArray[4]), Integer.parseInt(elementsArray[5])));
                    break;
                case "PassengerCar": result = increaseCarArrayByOneItem(result, new PassengerCar(elementsArray[1], Double.parseDouble(elementsArray[2]),
                        Double.parseDouble(elementsArray[3]),
                        Integer.parseInt(elementsArray[4]), elementsArray[5]));
                    break;
            }
        }
        return result;
    }
}
