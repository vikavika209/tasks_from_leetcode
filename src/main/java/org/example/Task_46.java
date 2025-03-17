package org.example;

//https://leetcode.com/problems/add-digits/description/

public class Task_46 {
    public static void main(String[] args) {
        int num = 38;
        int result;

        if (num == 0){
            result = 0;
        }

        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        result = num;

        System.out.println(result);
    }
}


