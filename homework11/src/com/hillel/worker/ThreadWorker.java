package com.hillel.worker;

import com.hillel.container.IntContainer;
import com.hillel.thread.PrimeThread;

import java.util.Scanner;

public class ThreadWorker {

    Scanner scanner;
    IntContainer container;

    public ThreadWorker(IntContainer container) {
        this.scanner = new Scanner(System.in);
        this.container = container;
    }

    public static void main(String[] args) {
        IntContainer container = new IntContainer();
        ThreadWorker worker = new ThreadWorker(container);
        worker.start();
        worker.stop();
    }

    public void start() {
        System.out.println("Enter numbers of threads: ");
        int numberOfThreads = scanner.nextInt();
        System.out.println("Enter start of range: ");
        int minNumber = scanner.nextInt();
        System.out.println("Enter end of range: ");
        int maxNumber = scanner.nextInt();

        if (numberOfThreads > 1) {
            countBySeveralThreads(numberOfThreads, minNumber, maxNumber);
        } else countByOneThread(numberOfThreads, minNumber, maxNumber);

        System.out.println(container);

    }

    private void countBySeveralThreads(int numberOfThreads, int minNumber, int maxNumber) {
        int tempMin = minNumber;
        int tempMax = maxNumber / 2;
        int tempMid = maxNumber / 2;
        PrimeThread[] myThreads = new PrimeThread[numberOfThreads];
        for (int i = 0; i <= numberOfThreads - 1; i++) {
            myThreads[i] = new PrimeThread(container, tempMax, tempMin);
            myThreads[i].getThread().start();
            tempMin = tempMax;
            tempMid = tempMid / 2;
            tempMax = tempMax + tempMid;
        }
        for (int i = 0; i <= numberOfThreads - 1; i++) {
            try {
                myThreads[i].getThread().join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void countByOneThread(int numberOfThreads, int minNumber, int maxNumber) {
        PrimeThread[] myThreads = new PrimeThread[numberOfThreads];
        for (int i = 0; i <= numberOfThreads - 1; i++) {
            myThreads[i] = new PrimeThread(container, maxNumber, minNumber);
            myThreads[i].getThread().start();
        }
        for (int i = 0; i <= numberOfThreads - 1; i++) {
            try {
                myThreads[i].getThread().join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void stop(){
        scanner.close();
    }
}
