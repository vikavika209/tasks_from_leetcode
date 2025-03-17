package org.example;

//https://leetcode.com/problems/single-number-iii/

import java.util.Arrays;
import java.util.HashMap;

public class Task_47 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[2];
        int index = 0;

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                result[index++] = key;
            }
        }

        System.out.println(Arrays.toString(result));

    }
}
