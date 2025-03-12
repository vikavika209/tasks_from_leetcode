package org.example;

//https://leetcode.com/problems/length-of-last-word/description/

public class Task_12 {
    public static void main(String[] args) {
        String s = "Hello      World     ";

        String[] words = s.trim().split(" ");
        int result = words[words.length - 1].length();
        System.out.println(result);
    }
}
