package org.example;

//https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

public class Task_9 {
    public static void main(String[] args) {

        boolean isParentheses = false;

        String s = "{[()}";

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    System.out.println(isParentheses);
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')){
                    isParentheses = false;
                }
            }
            isParentheses = stack.isEmpty();
        }
        System.out.println(isParentheses);
    }

}
