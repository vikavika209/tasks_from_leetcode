package org.example;

import java.util.Arrays;

//https://leetcode.com/problems/median-of-two-sorted-arrays/

public class Task_4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        Arrays.sort(mergedArray);

        double median;
        int n = mergedArray.length;

        if (n % 2 == 1) {
            median = mergedArray[n / 2];
        } else {
            median = (mergedArray[(n / 2) - 1] + mergedArray[n / 2]) / 2.0;
        }

        System.out.println("Median: " + median);
    }
}

