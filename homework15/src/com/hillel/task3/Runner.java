package com.hillel.task3;;

public class Runner {

    public static void main(String[] args) {
        FileWorker fileWorker = new FileWorker();
        fileWorker.readFile("file.txt");
        fileWorker.countAndShowWords();
    }
}
