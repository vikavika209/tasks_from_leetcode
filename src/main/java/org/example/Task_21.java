package org.example;

//https://leetcode.com/problems/count-and-say/

public class Task_21 {
    public static void main(String[] args) {
        int n = 5;
        String result;

        if (n <= 0) result = "";

        result = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char prevChar = result.charAt(0);

            for (int j = 1; j < result.length(); j++) {
                char currentChar = result.charAt(j);

                if (currentChar == prevChar) {
                    count++;

                } else {
                    sb.append(count).append(prevChar);
                    prevChar = currentChar;
                    count = 1;
                }
            }
            sb.append(count).append(prevChar);

            result = sb.toString();
        }
        System.out.println(result);
    }
}
