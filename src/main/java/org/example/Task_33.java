package org.example;

//https://leetcode.com/problems/binary-tree-preorder-traversal/

import java.util.*;

public class Task_33 {
    public static void main(String[] args) {
        Integer[] nums = {1,null,2,3};
        Solution_33 sol = new Solution_33();
        TreeNode root = sol.createBinaryTree(nums);
        System.out.println(sol.preorderTraversal(root));
    }
}

class Solution_33 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return result;
    }
        public TreeNode createBinaryTree(Integer[] arr) {
            if (arr == null || arr.length == 0) {
                return null;
            }

            TreeNode root = new TreeNode(arr[0]);
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            int i = 1;

            while (i < arr.length) {
                TreeNode current = queue.poll();

                if (current != null) {

                    if (i < arr.length && arr[i] != null) {
                        current.left = new TreeNode(arr[i]);
                        queue.offer(current.left);
                    }
                    i++;


                    if (i < arr.length && arr[i] != null) {
                        current.right = new TreeNode(arr[i]);
                        queue.offer(current.right);
                    }
                    i++;
                }
            }

            return root;
        }
    }

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
 }
