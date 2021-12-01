package LeetCodeQuestion;

/*
Link: https://leetcode.com/problems/merge-two-sorted-lists/

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by
splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */

public class MergeTwoSortedList {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedHead = null, mergedCurrentLastNode = null;
        ListNode temp1 = list1, temp2 = list2;

        while(temp1 != null && temp2 != null) {
            ListNode newNode;
            if(temp1.val < temp2.val) {
                newNode = new ListNode (temp1.val);

                temp1 = temp1.next;
            }
            else {
                newNode = new ListNode (temp2.val);

                temp2 = temp2.next;
            }

            if(mergedHead == null) {
                mergedHead = newNode;
                mergedCurrentLastNode = newNode;
            }
            else {
                mergedCurrentLastNode.next = newNode;
                mergedCurrentLastNode = newNode;
            }
        }

        while(temp1 != null) {
            ListNode newNode = new ListNode(temp1.val);

            if(mergedHead == null) {
                mergedHead = newNode;
                mergedCurrentLastNode = newNode;
            }
            else {
                mergedCurrentLastNode.next = newNode;
                mergedCurrentLastNode = newNode;
            }

            temp1 = temp1.next;
        }

        while(temp2 != null) {
            ListNode newNode = new ListNode(temp2.val);

            if(mergedHead == null) {
                mergedHead = newNode;
                mergedCurrentLastNode = newNode;
            }
            else {
                mergedCurrentLastNode.next = newNode;
                mergedCurrentLastNode = newNode;
            }

            temp2 = temp2.next;
        }

        return mergedHead;
    }

    public static void main(String[] args) {

    }
}
