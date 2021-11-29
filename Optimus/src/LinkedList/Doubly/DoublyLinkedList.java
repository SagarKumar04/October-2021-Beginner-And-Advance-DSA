package LinkedList.Doubly;

public class DoublyLinkedList {
    Node head;
    Node currentLastNode;

    class Node {
        Node prev;
        Object data;
        Node next;

        Node(Object d) {
            data = d;
            prev = next = null;
        }
    }

    public void push(Object newNodeData) {
        Node newNode = new Node(newNodeData);

        if(head == null) {
            head = newNode;
            currentLastNode = head;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void append(Object newNodeData) {
        Node newNode = new Node(newNodeData);

        if(head == null) {
            head = newNode;
        }
        else {
            currentLastNode.next = newNode;
            newNode.prev = currentLastNode;
        }
        currentLastNode = newNode;
    }

    public void insertAtPosition(int position, Object data) {
        Node newNode = new Node(data);

        Node temp = head;
        int currentPosition = 1;

        while(currentPosition != (position - 1)) {
            temp = temp.next;
            currentPosition = currentPosition + 1;
        }

        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.next.prev = newNode;
    }

    public void deleteFirst() {
        Node temp = head;
        head = head.next;

        if(head != null) {
            head.prev = null;
            temp.next = null;
        }
        else {
            currentLastNode = null;
        }
    }

    public void deleteAtAPosition(int position) {
        Node temp = head;
        int currentPosition = 1;

        while(currentPosition != (position - 1)) {
            temp = temp.next;
            currentPosition = currentPosition + 1;
        }

        Node delete = temp.next;

        temp.next = delete.next;
        if(delete.next != null) {
            delete.next.prev = temp;
        }
        else {
            currentLastNode = temp;
        }
        delete.prev = delete.next = null;
    }

    public void forwardTraversal() {
        System.out.println("Forward Traversal: ");
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public void backwardTraversal() {
        System.out.println("Backward Traversal: ");
        Node temp = currentLastNode;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.push("language");
        doublyLinkedList.push("programming");
        doublyLinkedList.push("a");
        doublyLinkedList.push("is");
        doublyLinkedList.push("Java");
        doublyLinkedList.push(3);
        doublyLinkedList.push(2);
        doublyLinkedList.push(1);

        doublyLinkedList.append(". ");
        doublyLinkedList.append("It");
        doublyLinkedList.append("is");
        doublyLinkedList.append("interesting");
        doublyLinkedList.append(1.25);
        doublyLinkedList.append(5.012);
        doublyLinkedList.append(3.547f);

        doublyLinkedList.insertAtPosition(4, "really");
        doublyLinkedList.insertAtPosition(5, "interesting");

        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteFirst();

        doublyLinkedList.deleteAtAPosition(12);
        doublyLinkedList.deleteAtAPosition(14);

        doublyLinkedList.append("Test");

        doublyLinkedList.forwardTraversal();
        doublyLinkedList.backwardTraversal();
    }
}
