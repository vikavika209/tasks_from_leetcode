package org.example;

//https://leetcode.com/problems/excel-sheet-column-number/

public class Task_36 {
    public static void main(String[] args) {
        String columnTitle = "AB";
        Solution_36 solution = new Solution_36();
        System.out.println(solution.titleToNumber(columnTitle));

    }
}

class Solution_36 {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}