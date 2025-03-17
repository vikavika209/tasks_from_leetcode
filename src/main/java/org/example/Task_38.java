package org.example;

//https://leetcode.com/problems/happy-number/

import java.util.HashSet;
import java.util.Set;

public class Task_38 {
    public static void main(String[] args) {
        int n = 19;
        Solution_38 solution = new Solution_38();
        System.out.println(solution.isHappy(n));

    }
}
class Solution_38 {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private int getNext(int number) {
        int totalSum = 0;
        while (number > 0) {
            int digit = number % 10;
            totalSum += digit * digit;
            number /= 10;
        }
        return totalSum;
    }

}