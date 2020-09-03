package com.hillel.collection;

import com.hillel.exception.CollectionIsEmptyException;
import com.hillel.model.Node;

public class List<T> {

    private Node<T> first;
    private Node<T> last;

    public List() {
    }

    public List(T[] array) {
        addArray(array);
    }

    private void addArray(T[] array) {
        for (T t : array) {
            addLast(t);
        }
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data, null);
        if (isEmpty()) {
            first = newNode;
            last = first;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data, null);
        if (isEmpty()) {
            addFirst(data);
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void addByIndex(int index, T data) {
        if (index != 1 && isEmpty()){
            throw new CollectionIsEmptyException();
        }
        if (index == 1){
            addFirst(data);
            return;
        }
        if (index == size()){
            addLast(data);
            return;
        }

        Node<T> newNode = new Node<T>(data, null);
        if (index == size()) {

            Node<T> tempFirst = first;
            Node<T> tempLast = tempFirst;
            while (tempFirst.getNext() != null) {
                tempLast = tempFirst;
                tempFirst = tempFirst.getNext();
            }
            tempLast.setNext(newNode);
            newNode.setNext(last);
        } else {
            index -= 1;
            Node<T> tempFirst = first;
            for (int i = 1; i < size(); i++) {
                if (i == index) {
                    Node<T> temp = tempFirst.getNext();
                    tempFirst.setNext(newNode);
                    newNode.setNext(temp);
                }
                tempFirst = tempFirst.getNext();
            }
        }
    }

    public void swap(T dataOne, T dataTwo) {
        Node<T> dataOneTemp = first;
        Node<T> dataOnePrevTemp = first;
        while (dataOneTemp.getNext() != null && dataOneTemp.getData() != dataOne) {
            dataOnePrevTemp = dataOneTemp;
            dataOneTemp = dataOneTemp.getNext();
        }

        Node<T> dataTwoTemp = first;
        Node<T> dataTwoPrevTemp = first;
        while (dataTwoTemp.getNext() != null && dataTwoTemp.getData() != dataTwo) {
            dataTwoPrevTemp = dataTwoTemp;
            dataTwoTemp = dataTwoTemp.getNext();
        }
        if (dataOneTemp == first)
            first = dataTwoTemp;
        else if (dataTwoTemp == first)
            first = dataOneTemp;

        if (dataTwoTemp == last)
            last = dataOneTemp;
        else if (dataOneTemp == last)
            last = dataTwoTemp;

        Node<T> tempDataOneTemp = dataOneTemp.getNext();
        Node<T> tempDataTwoTemp = dataTwoTemp.getNext();

        dataOnePrevTemp.setNext(dataTwoTemp);
        dataTwoTemp.setNext(tempDataOneTemp);
        dataTwoPrevTemp.setNext(dataOneTemp);
        dataOneTemp.setNext(tempDataTwoTemp);

        if (dataOneTemp == dataTwoPrevTemp) {
            dataTwoTemp.setNext(dataOneTemp);
            dataOneTemp.setNext(tempDataTwoTemp);
        } else if (dataTwoTemp == dataOnePrevTemp) {
            dataOneTemp.setNext(dataTwoTemp);
            dataTwoTemp.setNext(tempDataOneTemp);
        }
    }

    public int size() {
        return size(first);
    }

    private int size(Node<T> node) {
        if (node == null)
            return 0;
        else {
            int count = 1;
            count += size(node.getNext());
            return count;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void printList() {
        printList(first);
    }

    private void printList(Node<T> node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            printList(node.getNext());
        }
    }
}
