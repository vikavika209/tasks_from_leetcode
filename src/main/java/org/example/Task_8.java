package org.example;

//https://leetcode.com/problems/roman-to-integer/description/

import java.util.HashMap;
import java.util.Map;

public class Task_8 {
    public static void main(String[] args) {
        String s = "XXI";

        Map<String, Integer> romanPairs = new HashMap<>();
        romanPairs.put("IV", 4);
        romanPairs.put("IX", 9);
        romanPairs.put("XL", 40);
        romanPairs.put("XC", 90);
        romanPairs.put("CD", 400);
        romanPairs.put("CM", 900);

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int i = 0;

        while (i < s.length()){
            if (i < s.length() - 1){
                String pair = s.substring(i, i + 2);
                if (romanPairs.containsKey(pair)){
                    result += romanPairs.get(pair);
                    i += 2;
                    continue;
                }
            }
            result += romanMap.get(s.charAt(i));
            i++;
        }
        System.out.println(result);
    }
}
