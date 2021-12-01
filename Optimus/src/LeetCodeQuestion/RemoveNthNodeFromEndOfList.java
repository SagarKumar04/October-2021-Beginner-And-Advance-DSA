package LeetCodeQuestion;

/*
Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */

public class RemoveNthNodeFromEndOfList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int findLength(ListNode head) {
        ListNode temp = head;
        int length = 0;

        while(temp != null) {
            length++;
            temp = temp.next;
        }

        return length;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = findLength(head);
        int nFromStart = length - n + 1;
        ListNode temp = head;

        if(nFromStart == 1) {
            head = head.next;
            temp.next = null;
        }
        else {
            temp = head;
            int currentPosition = 1;

            while(currentPosition != (nFromStart - 1)) {
                temp = temp.next;
                currentPosition = currentPosition + 1;
            }

            ListNode delete = temp.next;
            temp.next = delete.next;
            delete.next = null;
        }

        return head;
    }
}
