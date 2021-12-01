package LeetCodeQuestion;

/*
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 */

public class RemoveDuplicatesFromSortedList {
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

    public ListNode deleteDuplicates(ListNode head) {
        if(head != null) {
            ListNode currentNode = head;
            ListNode nextNode = currentNode.next;

            while(nextNode != null) {
                if(currentNode.val == nextNode.val) {
                    currentNode.next = nextNode.next;
                    nextNode.next = null;
                    nextNode = currentNode.next;
                }
                else {
                    currentNode = nextNode;
                    nextNode = currentNode.next;
                }
            }
        }

        return head;
    }
}
