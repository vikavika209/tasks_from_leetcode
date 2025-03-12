package org.example;

//https://leetcode.com/problems/single-number/description/

public class Task_30 {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        System.out.println(result);
    }
}


