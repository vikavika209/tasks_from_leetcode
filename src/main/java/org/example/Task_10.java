package org.example;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class Task_10 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int h = haystack.length();
        int n = needle.length();
        int result = -1;

        for (int i = 0; i <= h - n; i++){
            if (haystack.substring(i, i + n).equals(needle)){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
