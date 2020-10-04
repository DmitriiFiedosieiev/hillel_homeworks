package com.hillel.worker;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalyzer {

    private String textForAnalysis;

    public TextAnalyzer(String textForAnalysis) {
        this.textForAnalysis = textForAnalysis;
    }

    public LinkedList<String> showCountedWords() {
        Set<Map.Entry<String, Integer>> set = countWords(textForAnalysis).entrySet();
        LinkedList<String> result = new LinkedList<>();
        for (Map.Entry<String, Integer> el : set) {
            result.add(el.getKey() + " " + el.getValue());
        }
        return result;
    }


    public String replaceSymbol(int number, char symbol) {
        return textForAnalysis.replaceAll(String.format("(\\b\\w{%d})\\w", number - 1),"$1" + symbol);
    }

    public String showWordsWithSameFirstLast() {
        Pattern pattern = Pattern.compile("(([\\w])[\\w]*\\2)");
        Matcher matcher = pattern.matcher(textForAnalysis);
        String result = "";
        while (matcher.find()) {
            result += " " + matcher.group();
        }
        return result;
    }

    public int countMarks() {
        Pattern pattern = Pattern.compile("[^\\w-: ]");
        Matcher matcher = pattern.matcher(textForAnalysis);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }

    private HashMap<String, Integer> countWords (String text){
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(text);
        HashMap<String, Integer> result = new HashMap<>();
        while (matcher.find()) {
            String word = matcher.group();
            result.merge(word, 1, Integer::sum);
            }
        return result;
    }
}

