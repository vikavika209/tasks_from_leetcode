package org.example;

//https://leetcode.com/problems/missing-number/

public class Task_50 {
    public static void main(String[] args) {
        int[] nums = {0,1};

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        System.out.println(expectedSum - actualSum);

    }
}
