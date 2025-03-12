package org.example;

//https://leetcode.com/problems/sqrtx/description/

public class Task_18 {
    public static void main(String[] args) {
        int x = 8;

        if (x < 2) {
            System.out.println(x);
            System.exit(0);
        }

        int left = 1, right = x;
        while (left <= right) {
            int mid = (left + right) / 2;
            long midSquared = (long) mid * mid;

            if (midSquared == x) {
                System.out.println(mid);
                System.exit(0);
            }else if (midSquared < x) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}
