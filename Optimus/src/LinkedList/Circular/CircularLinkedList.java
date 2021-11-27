package LinkedList.Circular;

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
        circularLinkedList.append(33);
        circularLinkedList.push(3);
        circularLinkedList.push(8);
        circularLinkedList.append(22);

        circularLinkedList.traversal();
    }
}
