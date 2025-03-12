package org.example;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Task_26 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        System.out.println(maxProfit);
    }

}
