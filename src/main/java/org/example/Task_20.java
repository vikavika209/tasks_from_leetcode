package org.example;

//https://leetcode.com/problems/valid-sudoku/

import java.util.HashSet;

public class Task_20 {
    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        boolean isValid = false;


        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char current = board[i][j];

                    if (current == '.') {
                        continue;
                    }

                    if (rows[i].contains(current)) {
                        isValid = false;
                    }
                    rows[i].add(current);

                    if (cols[j].contains(current)) {
                        isValid = false;
                    }
                    cols[j].add(current);

                    int boxIndex = (i / 3) * 3 + (j / 3);
                    if (boxes[boxIndex].contains(current)) {
                        isValid = false;
                    }
                    boxes[boxIndex].add(current);
                }
            }
            isValid = true;
        System.out.println(isValid);
        }
}
