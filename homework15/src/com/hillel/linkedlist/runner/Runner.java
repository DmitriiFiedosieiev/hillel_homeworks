package com.hillel.linkedlist.runner;

import com.hillel.linkedlist.collection.List;

public class Runner {

    public static void main(String[] args) {
        List<Integer> list = new List<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(9);
        list.addFirst(8);
        System.out.println(list);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        list.addByIndex(2, 8);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.removeByIndex(3);
        System.out.println(list);
        list.swap(1,2);
        System.out.println(list);
        System.out.println();
        for (int i : list) {
            System.out.println(i);
        }
    }
}
