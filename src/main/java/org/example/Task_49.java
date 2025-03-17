package org.example;

//https://leetcode.com/problems/ugly-number-ii/

public class Task_49 {
    public static void main(String[] args) {

        int n = 10;
        int[] ugly = new int[n];
        ugly[0] = 1;

        int index2 = 0, index3 = 0, index5 = 0;
        int next2 = 2, next3 = 3, next5 = 5;

        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(next2, Math.min(next3, next5));
            ugly[i] = nextUgly;

            if (nextUgly == next2) {
                index2++;
                next2 = ugly[index2] * 2;
            }

            if (nextUgly == next3) {
                index3++;
                next3 = ugly[index3] * 3;
            }

            if (nextUgly == next5) {
                index5++;
                next5 = ugly[index5] * 5;
            }
        }
        System.out.println(ugly[n - 1]);

    }
}
