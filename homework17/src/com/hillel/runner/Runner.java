package com.hillel.runner;

import com.hillel.worker.TextAnalyzer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

    public static void main(String[] args) {
        String text = "Holmes occasionally uses addictive drugs, especially in the absence of stimulating cases." +
                " He sometimes used morphine and sometimes cocaine, the latter of which he injects in a seven-percent solution.";
        TextAnalyzer textAnalyzer = new TextAnalyzer(text);
        //System.out.println(textAnalyzer.showCountedWords());
        //System.out.println(textAnalyzer.replaceSymbol(2, 'A'));
        //System.out.println(textAnalyzer.countMarks());
        System.out.println(textAnalyzer.showWordsWithSameFirstLast());
    }
}
