package org.example;

//https://leetcode.com/problems/palindrome-number/

public class Task_6 {
    public static void main(String[] args) {

        boolean isPalindrome = false;

        int x = 123456;

        StringBuilder st = new StringBuilder(Integer.toString(x));
        st.reverse();

        int revercedInt = Integer.parseInt(st.toString());

        if (x == revercedInt) {
            isPalindrome = true;
        }


        System.out.println(isPalindrome);
    }
}