package org.example;

//https://leetcode.com/problems/generate-parentheses/

import java.util.*;

public class Task_17 {
    public static void main(String[] args) {

        int n = 3;

        Set<String> result = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer("");

        while (!queue.isEmpty()) {
            String current = queue.poll();

            if (current.length() == 2 * n) {
                result.add(current);
                continue;
            }

            if (countChar(current, '(') < n) {
                queue.offer(current + "(");
            }

            if (countChar(current, ')') < countChar(current, '(')) {
                queue.offer(current + ")");
            }
        }
        System.out.println(result);
    }

    private static int countChar(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}
