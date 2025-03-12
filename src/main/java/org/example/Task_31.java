package org.example;

//https://leetcode.com/problems/single-number-ii/description/

public class Task_31 {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};

        int ones = 0, twos = 0;

        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        System.out.println(ones);
    }
}
