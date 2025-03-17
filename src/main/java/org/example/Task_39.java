package org.example;

//https://leetcode.com/problems/invert-binary-tree/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Task_39 {
    public static void main(String[] args) {
        Solution_33 solution = new Solution_33();
        Integer[] nums = {4, 2, 7, 1, 3, 6, 9};
        TreeNode root = solution.createBinaryTree(nums);
        Solution_39 sol = new Solution_39();
        TreeNode invertTree = sol.invertTree(root);
        System.out.println(sol.treeNodeToArray(invertTree));
    }
}

class Solution_39 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public ArrayList<Integer> treeNodeToArray(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            result.add(current.val);

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return result;
    }
}
