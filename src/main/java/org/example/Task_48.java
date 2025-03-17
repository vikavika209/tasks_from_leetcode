package org.example;

public class Task_48 {
    public static void main(String[] args) {
        int n = 6;
        boolean result;

        if (n <= 0) {
            result = false;
        }

        int[] markers = {2, 3, 5};

        for (int marker : markers) {
            while (n % marker == 0) {
                n /= marker;
            }
        }
        result = n == 1;
        System.out.println(result);
    }
}
