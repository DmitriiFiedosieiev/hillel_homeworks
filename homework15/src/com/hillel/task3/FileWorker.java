package com.hillel.task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileWorker {

    private String readString;

    public void readFile(String path){
        try(FileInputStream inputStream = new FileInputStream(path)) {
            byte[] bytes = inputStream.readAllBytes();
            readString = new String(bytes);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void countAndShowWords() {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = readString.split(" ");
        for (String key : words) {
            map.put(key, 0);
        }

        Set<Map.Entry<String,Integer>> set = map.entrySet();

        for (Map.Entry<String, Integer> me : set) {
            for (String key : words){
                if (me.getKey().equals(key)) {
                    me.setValue(me.getValue() + 1);
                }
            }
        }

        for (Map.Entry<String,Integer> m : set) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
    }
}
