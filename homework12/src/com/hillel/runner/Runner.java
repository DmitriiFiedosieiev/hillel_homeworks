package com.hillel.runner;

import com.hillel.model.Car;
import com.hillel.worker.FileWorker;

public class Runner {


    public static void main(String[] args) {
        FileWorker fileWorker = new FileWorker("E:\\\\InitialFile.txt", "E:\\\\FinalFile.txt");
        Car[] cars = fileWorker.readFile();
        fileWorker.writeFile(cars);
    }
}
