package org.example;

//https://leetcode.com/problems/search-insert-position/description/

public class Task_11 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 10;

        int first = 0;
        int last = nums.length - 1;

        int result = 0;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (nums[mid] == target) {
                result = mid;
                break;
            }
            else if (nums[mid] < target) {
                first = mid + 1;
            }else {
                last = mid - 1;
            }
        }
        result = first;
        System.out.println(result);
    }
}
