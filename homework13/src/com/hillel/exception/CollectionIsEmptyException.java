package com.hillel.exception;

public class CollectionIsEmptyException extends RuntimeException {

    public CollectionIsEmptyException() {
    }

    @Override
    public String toString() {
        return "Collection is empty ";
    }
}
