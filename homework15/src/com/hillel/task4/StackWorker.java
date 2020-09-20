package com.hillel.task4;

import java.util.Stack;

public class StackWorker {

    public static void main(String[] args) {
        StackWorker stackWorker = new StackWorker();
        System.out.println(stackWorker.remakeToPostFix("(1+2)-3*4"));
    }

    public String remakeToPostFix(String string) {
        Stack<Character> stack = new Stack<>();
        String postFix = "";
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (c != '+' && c != '-' && c != '*' && c != '/' && c != '(' && c != ')') {
                postFix += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty()) {
                    char t = stack.pop();
                    if (t != '(') {
                        postFix += t;
                    } else {
                        break;
                    }
                }
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    while (!stack.isEmpty()) {
                        char t = stack.pop();
                        if (t == '(') {
                            stack.push(t);
                            break;
                        } else if (t == '+' || t == '-' || t == '*' || t == '/') {
                            if (getPriority(t) < getPriority(c)) {
                                stack.push(t);
                                break;
                            } else {
                                postFix += t;
                            }
                        }
                    }
                    stack.push(c);
                }
            }
        }
        while (!stack.isEmpty()) {
            postFix += stack.pop();
        }
        return postFix;
    }

    private int getPriority(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else return 2;
    }
}
