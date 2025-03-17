package org.example;

//https://leetcode.com/problems/number-of-1-bits/description/

public class Task_37 {
    public static void main(String[] args) {
        int n = 11;
        Solution_37 solution = new Solution_37();
        System.out.println(solution.hammingWeight(n));

    }
}

class Solution_37 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
