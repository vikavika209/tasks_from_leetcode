package org.example;

//https://leetcode.com/problems/majority-element/

public class Task_35 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        Solution_35 solution = new Solution_35();
        System.out.println(solution.majorityElement(nums));

    }
}

class Solution_35 {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
