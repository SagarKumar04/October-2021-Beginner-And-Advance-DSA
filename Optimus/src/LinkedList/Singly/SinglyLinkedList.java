package LinkedList.Singly;

public class SinglyLinkedList {
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

    public int findLength() {
        int length = 0;

        if(head != null) {
            Node temp = head;
            while(temp != null) {
                length = length + 1;
                temp = temp.next;
            }
        }

        return length;
    }

    public void traverse() {
        if(head == null) {
            System.out.println("List is empty.");
        }
        else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }

    //Insert a new node at the start of the linked list
    public void push(int newNodeData) {
        //1. Create a node
        //2. Put data in the node
        //3. Set 'next' to NULL
        Node newNode = new Node(newNodeData);

        if(head == null) {
            currentLastNode = newNode;
        }

        //4. Link new node to the current first node
        newNode.next = head;

        //5. Make the new node as the first node
        head = newNode;
    }

    //Insert a new node at the end of the linked list
    public void append(int newNodeData) {
        //1. Create a node
        //2. Put data in the node
        //3. Set 'next' to NULL
        Node newNode = new Node(newNodeData);

        //4. If linked list is empty, make 'head' point to the new node
        if(head == null) {
            head = newNode;
        }
        //5. If linked list is not empty
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        currentLastNode = newNode;
    }

    public void appendOptimised(int newNodeData) {
        //1. Create a node
        //2. Put data in the node
        //3. Set 'next' to NULL
        Node newNode = new Node(newNodeData);

        //4. If linked list is empty, make 'head' point to the new node
        if(head == null) {
            head = newNode;
        }
        //5. If linked list is not empty
        else {
            currentLastNode.next = newNode;
        }
        currentLastNode = newNode;
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

    public void deleteFirstNode() {
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deleteOtherNode(int position, int length) {
        Node temp = head;
        int currentPosition = 1;

        while(currentPosition != (position - 1)) {
            temp = temp.next;
            currentPosition++;
        }

        Node delete = temp.next;
        temp.next = delete.next;
        delete.next = null;

        if(position == length) {
            currentLastNode = temp;
        }
    }

    /*
    public void deleteLastNode(int length) {
        Node temp = head;
        int currentPosition = 1;

        while(currentPosition != (length - 1)) {
            temp = temp.next;
            currentPosition++;
        }

        temp.next = null;
        currentLastNode = temp;
    }
     */

    public void delete(int position) {
        int length = findLength();

        if(position == 1) {
            deleteFirstNode();
        }
        /*
        else if(position == length) {
            deleteLastNode(length);
        }
         */
        else {
            deleteOtherNode(position, length);
        }
    }

    public static void main(String[] args) {
        int length;

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.push(15);
        singlyLinkedList.append(40);

        length = singlyLinkedList.findLength();
        singlyLinkedList.delete(length - 1);

        singlyLinkedList.appendOptimised(1001);

        singlyLinkedList.append(10);
        singlyLinkedList.insertAtPosition(3, 11);
        singlyLinkedList.push(25);
        singlyLinkedList.appendOptimised(100);

        length = singlyLinkedList.findLength();
        singlyLinkedList.delete(length);

        singlyLinkedList.appendOptimised(101);

        singlyLinkedList.push(35);
        singlyLinkedList.insertAtPosition(6, 22);
        singlyLinkedList.append(30);
        singlyLinkedList.appendOptimised(300);

        length = singlyLinkedList.findLength();
        singlyLinkedList.delete(length - 4);

        singlyLinkedList.appendOptimised(101);

        singlyLinkedList.appendOptimised(200);
        singlyLinkedList.push(45);

        length = singlyLinkedList.findLength();
        singlyLinkedList.delete(length);

        singlyLinkedList.appendOptimised(101);

        singlyLinkedList.insertAtPosition(10, 33);

        singlyLinkedList.traverse();
        System.out.println();

        singlyLinkedList.delete(1);

        singlyLinkedList.traverse();
        System.out.println();
    }
}
