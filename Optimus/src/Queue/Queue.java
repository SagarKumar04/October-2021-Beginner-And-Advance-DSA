package Queue;

public class Queue {
    int front, rear, size, capacity, queue[];

    Queue(int capacity) {
        this.capacity = capacity;
        front = -1;
        size = 0;
        rear = -1;
        queue = new int[this.capacity];
    }

    boolean isFull() {
        boolean result = (size == capacity);

        return result;
    }

    void enqueue(int data) {
        if(isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if(front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            }
            else {
                rear = (rear + 1) % capacity;
            }
            queue[rear] = data;
            size = size + 1;

            System.out.println("Enqueued: " + data);
        }
    }

    boolean isEmpty() {
        boolean result = (size == 0);

        return result;
    }

    void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        else {
            int data = queue[front];
            front = (front + 1) % capacity;
            size = size - 1;

            System.out.println("Dequeued: " + data);
        }
    }

    void traverse() {
        if(isEmpty()) {
            System.out.println("Can't traverse. Queue is empty.");
        }
        else {
            System.out.println("Elements in the queue are: ");
            if(front <= rear) {
                for(int i = front; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
            }
            else {
                for(int i = front; i < capacity; i++) {
                    System.out.print(queue[i] + " ");
                }

                for(int i = 0; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.traverse();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.traverse();

        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);

        queue.traverse();

    }
}
