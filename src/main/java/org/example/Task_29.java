package org.example;

//https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashSet;

public class Task_29 {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};

        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        System.out.println(longestStreak);
    }
}
