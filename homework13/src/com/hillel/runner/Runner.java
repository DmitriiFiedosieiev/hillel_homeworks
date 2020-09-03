package com.hillel.runner;

import com.hillel.collection.List;


public class Runner {

    public static void main(String[] args) {
        List<Integer> list = new List<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.printList();
        System.out.println(list.size());
        list.addByIndex(2,10);
        list.printList();
        System.out.println(list.size());
        list.swap(10,3);
        list.printList();
    }
}
