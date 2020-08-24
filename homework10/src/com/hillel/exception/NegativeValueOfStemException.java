package com.hillel.exception;

public class NegativeValueOfStemException extends Exception {
    int min;
    int max;

    public NegativeValueOfStemException(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String getMessage() {
        return "Invalid or negative value of min length " + min + " or max length" + max;
    }
}
