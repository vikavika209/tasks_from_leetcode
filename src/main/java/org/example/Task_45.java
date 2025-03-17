package org.example;


//https://leetcode.com/problems/binary-tree-paths/

import java.util.ArrayList;
import java.util.List;

public class Task_45 {
    public static void main(String[] args) {
        Integer[] root = {1,2,3,null,5};

        Solution_33 solution33 = new Solution_33();
        Solution_45 solution45 = new Solution_45();

        TreeNode rootNode = solution33.createBinaryTree(root);

        System.out.println(solution45.binaryTreePaths(rootNode));

    }
}

class Solution_45 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;

        dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if (node == null) return;

        path += node.val;

        if (node.left == null && node.right == null) {
            result.add(path);
        } else {

            path += "->";
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }
    }
}
