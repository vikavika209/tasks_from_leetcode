package org.example;

//https://leetcode.com/problems/pascals-triangle/

import java.util.ArrayList;
import java.util.List;

public class Task_23 {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result;

        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            result = triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);

            for (int j = 1; j < i; j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                newRow.add(sum);
            }

            newRow.add(1);

            triangle.add(newRow);
        }
        result = triangle;
        System.out.println(result);
    }
}
