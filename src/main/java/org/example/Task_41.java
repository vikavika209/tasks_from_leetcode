package org.example;

//https://leetcode.com/problems/power-of-two/

public class Task_41 {
    public static void main(String[] args) {

        int n = 3;

        boolean isPowerOfTwo = false;
            if (n <= 0) {
                isPowerOfTwo = false;
            }

            while (n % 2 == 0) {
                n /= 2;
            }

            isPowerOfTwo = n == 1;

        System.out.println(isPowerOfTwo);

    }
}
