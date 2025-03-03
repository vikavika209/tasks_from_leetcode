package org.example;

//https://leetcode.com/problems/two-sum/description/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) {

        int[] nums = new int[]{3,2,4};
        int target = 6;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int different = target - nums[i];
            if (map.containsKey(different)) {
                int[] result = new int[]{map.get(different), i};
                System.out.println(Arrays.toString(result));
            }
            map.put(nums[i], i);
        }
    }
}