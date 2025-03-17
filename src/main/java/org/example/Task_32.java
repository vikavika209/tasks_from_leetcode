package org.example;

public class Task_32 {
    public static void main(String[] args) {
        int[] nums = {3,2,0,-4};
        int pos = 1;
        Solution_32 solution = new Solution_32();
        ListNode head = solution.createListNode(nums, pos);

        System.out.println(new Solution_32().hasCycle(head));

    }

}

class Solution_32 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public ListNode createListNode(int[] values, int pos) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleNode = null;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;

            if (i == pos) {
                cycleNode = current;
            }
        }

        if (pos != -1) {
            current.next = cycleNode;
        }

        return head;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}








