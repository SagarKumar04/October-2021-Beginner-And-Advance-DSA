package LeetCodeQuestion;

/*
Link: https://leetcode.com/problems/add-two-numbers/

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class AddTwoNumbers {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1, temp2 = l2;
        ListNode resultHead = null, currentLastNode = null;

        int carry = 0;
        while(temp1 != null && temp2 != null) {
            int sum = temp1.val + temp2.val + carry;

            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);

            if(resultHead != null) {
                currentLastNode.next = newNode;
                currentLastNode = newNode;
            }
            else {
                resultHead = newNode;
                currentLastNode = newNode;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while(temp1 != null) {
            int sum = temp1.val + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            currentLastNode.next = newNode;
            currentLastNode = newNode;

            temp1 = temp1.next;
        }

        while(temp2 != null) {
            int sum = temp2.val + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            currentLastNode.next = newNode;
            currentLastNode = newNode;

            temp2 = temp2.next;
        }

        if(carry > 0) {
            ListNode newNode = new ListNode(carry);
            currentLastNode.next = newNode;
            currentLastNode = newNode;
        }

        return resultHead;
    }
}
