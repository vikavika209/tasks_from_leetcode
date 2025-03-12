package org.example;

//https://leetcode.com/problems/plus-one/description/

import java.util.Arrays;

public class Task_13 {
    public static void main(String[] args) {
        int[] nums = {1, 9};

        for (int i = nums.length - 1; i >= 0; i--){
            if (nums[i] < 9){
            nums[i]++;
                System.out.println(Arrays.toString(nums));
                System.exit(0);
            }
            else {
                nums[i] = 0;
            }
        }

        int[] newNums = new int[nums.length + 1];

        System.arraycopy(nums, 0, newNums, 1, nums.length);

        newNums[0] = 1;

        System.out.println(Arrays.toString(newNums));
    }
}
