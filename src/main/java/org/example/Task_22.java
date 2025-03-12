package org.example;

//https://leetcode.com/problems/combination-sum/

import java.util.ArrayList;
import java.util.List;

public class Task_22 {
    public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> resultToPrint;

        List<List<Integer>> result = new ArrayList<>();

        dfs(candidates, target, 0, new ArrayList<>(), result);

        System.out.println(result);

    }
    private static void dfs(int[] candidates, int target, int index, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        dfs(candidates, target, index + 1, path, result);

        path.add(candidates[index]);
        dfs(candidates, target - candidates[index], index, path, result);
        path.remove(path.size() - 1);
    }
}
