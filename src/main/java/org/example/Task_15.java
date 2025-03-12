package org.example;

//https://leetcode.com/problems/3sum-closest/

public class Task_15 {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int initialSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    System.out.println(sum);
                    System.exit(0);
                }
                if (Math.abs(target - sum) < Math.abs(target - initialSum)) {
                    initialSum = sum;
                }
                if (sum < target) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        System.out.println(initialSum);
    }
}
