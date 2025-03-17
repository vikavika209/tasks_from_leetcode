package org.example;

//https://leetcode.com/problems/valid-anagram/

import java.util.Arrays;

public class Task_44 {
    public static void main(String[] args) {
        Solution_44 sol = new Solution_44();

        String s = "anagram";
        String t = "nagaram";

        System.out.println(sol.isAnagram(s, t));

    }
}

class Solution_44 {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}

