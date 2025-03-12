package org.example;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;

public class Task_3 {
    public static void main(String[] args) {
        String s = "pwwkew";


        HashSet<Character> set = new HashSet<>();
        int result = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            while (set.contains(s.charAt(j))) {
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(s.charAt(j));
                result = Math.max(result, j - i + 1);
            }
            System.out.println(result);
        }
}
