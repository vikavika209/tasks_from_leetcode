package org.example;

//https://leetcode.com/problems/pascals-triangle-ii/

import java.util.ArrayList;
import java.util.List;

public class Task_24 {
    public static void main(String[] args) {
        int rowIndex = 3;

        List<Integer> result;

        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }
        result = row;
        System.out.println(result);
    }
}
