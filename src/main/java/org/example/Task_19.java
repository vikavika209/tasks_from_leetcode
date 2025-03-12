package org.example;

//https://leetcode.com/problems/climbing-stairs/

public class Task_19 {
    public static void main(String[] args) {

        int n = 3;

        int result;

        if (n == 1) {
            result = 1;
        }else if (n == 2) {
            result = 2;
        }else {

            int prev1 = 2;
            int prev2 = 1;
            int current = 0;

            for (int i = 3; i <= n; i++) {
                current = prev1 + prev2;
                prev2 = prev1;
                prev1 = current;
            }
            result = current;
        }

        System.out.println(result);
    }
}
