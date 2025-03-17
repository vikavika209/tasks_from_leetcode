package org.example;

//https://leetcode.com/problems/summary-ranges/

import java.util.ArrayList;
import java.util.List;

public class Task_40 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        Solution_40 solution = new Solution_40();
        System.out.println(solution.summaryRanges(nums));

    }
}

class Solution_40 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != end + 1) {

                if (start == end) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + end);
                }

                start = nums[i];
            }
            end = nums[i];
        }

        if (start == end) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + end);
        }

        return result;
    }
}
