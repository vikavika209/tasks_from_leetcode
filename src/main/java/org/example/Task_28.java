package org.example;

//https://leetcode.com/problems/valid-palindrome/

public class Task_28 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int left = 0;
        int right = s.length() - 1;

        boolean result = false;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                result = false;
            }
            left++;
            right--;
            result = true;
        }
        System.out.println(result);
    }
}
