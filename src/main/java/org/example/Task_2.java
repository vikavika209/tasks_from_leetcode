package org.example;

//https://leetcode.com/problems/add-two-numbers/description/

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(9, 9, 9, 9, 9, 9, 9));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(9, 9, 9, 9));
        LinkedList<Integer> l3 = new LinkedList<>();

        Collections.reverse(l1);
        Collections.reverse(l2);

        while (l1.size() < l2.size()) l1.add(0);
        while (l2.size() < l1.size()) l2.add(0);

        int remainder = 0;

        for (int i = 0; i < l1.size(); i++) {
            int sum = l1.get(i) + l2.get(i) + remainder;
            remainder = sum / 10;
            l3.add(sum % 10);
        }

        if (remainder != 0) {
            l3.add(remainder);
        }
        
        System.out.println(l3);
    }
}
