package com.hillel.thread;

import com.hillel.container.IntContainer;
import com.hillel.utils.ArrayUtils;

public class PrimeThread implements Runnable {

    private int[] numbers;
    private IntContainer container;
    private int maxNumber;
    private int minNumber;
    Thread thread;

    public PrimeThread(IntContainer container, int maxNumber, int minNumber) {
        this.numbers = new int[0];
        this.container = container;
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
        thread = new Thread(this);
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = minNumber; i <= maxNumber; i++) {
            if (isPrime(i)) {
                numbers = ArrayUtils.increaseArray(numbers);
                numbers[count] = i;
                count++;
            }
        }
        container.fillContainer(numbers, count);
    }

    private boolean isPrime(int number) {
        boolean prime = true;
        int temp;
        for (int i = 2; i <= number/2; i++) {
            temp = number % i;
            if (temp == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public IntContainer getContainer() {
        return container;
    }

    public void setContainer(IntContainer container) {
        this.container = container;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }
}
