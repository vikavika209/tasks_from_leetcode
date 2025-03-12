package org.example;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

public class Task_27 {
    public static void main(String[] args) {
        int [] prices = {1,2,3,4,5};

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        System.out.println(maxProfit);
    }
}
