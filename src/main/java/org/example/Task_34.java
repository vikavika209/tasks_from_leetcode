package org.example;

//https://leetcode.com/problems/binary-tree-postorder-traversal/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Task_34 {
    public static void main(String[] args) {
        Integer[] nums = {1,null,2,3};
        Solution_33 solution33 = new Solution_33();
        TreeNode root = solution33.createBinaryTree(nums);
        Solution_34 solution34 = new Solution_34();
        System.out.println(solution34.postorderTraversal(root));

    }
}

class Solution_34 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.peek();

            if (prev == null || prev.left == current || prev.right == current) {
                if (current.left != null) {
                    stack.push(current.left);
                } else if (current.right != null) {
                    stack.push(current.right);
                } else {
                    stack.pop();
                    result.add(current.val);
                }
            }

            else if (current.left == prev) {
                if (current.right != null) {
                    stack.push(current.right);
                } else {
                    stack.pop();
                    result.add(current.val);
                }
            }

            else if (current.right == prev) {
                stack.pop();
                result.add(current.val);
            }

            prev = current;
        }
        return result;
    }
}

