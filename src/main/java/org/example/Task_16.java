package org.example;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.*;

public class Task_16 {
    public static void main(String[] args) {
        String nums = "23";

        Queue<String> queue = new LinkedList<>();
        queue.add("");

        final Map<Character, String> numsToLetters = Map.of(
                '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
                '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
        );

        for (char ch : nums.toCharArray()) {
            String letters = numsToLetters.get(ch);
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String combination = queue.poll();
                for (char letter : letters.toCharArray()) {
                    queue.add(combination + letter);
                }
            }
        }
        System.out.println(queue);
    }
}
