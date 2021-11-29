package LinkedList.Circular;

import LinkedList.Singly.SinglyLinkedList;

public class CircularLinkedList {
    Node head;
    Node currentLastNode;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void traversal() {
        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while(temp != head);
    }

    public void push(int newNodeData) {
        Node newNode = new Node(newNodeData);

        if(head == null) {
            newNode.next = newNode;
            head = newNode;
            currentLastNode = newNode;
        }
        /*
        else if(head == head.next) {
            currentLastNode = head;
            newNode.next = head;
            head.next = newNode;
            head = newNode;
        }
         */
        else {
            newNode.next = head;
            currentLastNode.next = newNode;
            head = newNode;
        }
    }

    public void deleteFirst() {
        Node temp = head;
        head = head.next;
        temp.next = null;
        currentLastNode.next = head;
    }

    public void deleteAtOtherPosition(int position) {
        Node temp = head;
        int currentPosition = 1;

        while(currentPosition != (position - 1)) {
            temp = temp.next;
            currentPosition = currentPosition + 1;
        }

        Node delete = temp.next;

        temp.next = delete.next;
        delete.next = null;

        if(temp.next == head) {
            currentLastNode = temp;
        }
    }

    public void insertAtPosition(int position, int newNodeData) {
        //1. Create a node
        //2. Put data in the node
        //3. Set 'next' to NULL
        Node newNode = new Node(newNodeData);

        //4. Make 'temp' point to the first node
        Node temp = head;

        //5. Set current position as 1
        int currentPosition = 1;

        //6. Traverse through the linked list and reach node at (position - 1)
        while(currentPosition != (position - 1)) {
            temp = temp.next;
            currentPosition = currentPosition + 1;
        }

        //7. Make new node point to the next node after 'temp'
        newNode.next = temp.next;

        //8. Make 'temp' node point to the new node
        temp.next = newNode;
    }

    public void append(int newNodeData) {
        Node newNode = new Node(newNodeData);

        if(head == null) {
            newNode.next = head = currentLastNode = newNode;
        }
        else {
            currentLastNode.next = newNode;
            newNode.next = head;
            currentLastNode = newNode;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList.push(5);
        circularLinkedList.push(7);
        circularLinkedList.append(11);
        circularLinkedList.push(1);
        circularLinkedList.insertAtPosition(3, 100);
        circularLinkedList.append(33);
        circularLinkedList.push(3);
        circularLinkedList.insertAtPosition(2, 200);
        circularLinkedList.push(8);
        circularLinkedList.append(22);

        circularLinkedList.deleteFirst();
        circularLinkedList.deleteFirst();
        circularLinkedList.deleteAtOtherPosition(3);
        circularLinkedList.deleteAtOtherPosition(7);
        circularLinkedList.deleteAtOtherPosition(6);

        circularLinkedList.append(1000);
        circularLinkedList.append(2000);

        circularLinkedList.traversal();
    }
}
