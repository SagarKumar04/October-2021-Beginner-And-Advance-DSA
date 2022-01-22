package Heaps;

public class MaxHeap {
    private int heap[];
    private int size;
    private int maxSize;

    MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        heap = new int[maxSize];
    }

    void printHeap() {
        System.out.println("Size: " + size);

        for(int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    void swap(int position1, int position2) {
        int temp = heap[position1];
        heap[position1] = heap[position2];
        heap[position2] = temp;
    }

    int parent(int position) {
        return (int)Math.floor((position - 1) / 2);
    }

    int leftChild(int position) {
        return (2 * position + 1);
    }

    int rightChild(int position) {
        return (2 * position + 2);
    }

    boolean isLeaf(int position) {
        if(position > (size / 2) && position <= size) {
            return true;
        }
        return false;
    }

    void insert(int element) {
        heap[size] = element;

        //Rearrange the heap
        int current = size;
        while(heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }

        size++;
    }

    void maxHeapify(int position) {
        if(!isLeaf(position)) {
            if(heap[position] < heap[leftChild(position)]
            || heap[position] < heap[rightChild(position)]) {
                if(heap[leftChild(position)] > heap[rightChild(position)]) {
                    swap(position, leftChild(position));
                    maxHeapify(leftChild(position));
                }
                else {
                    swap(position, rightChild(position));
                    maxHeapify(rightChild(position));
                }
            }
        }
    }

    int extractFirstElement() {
        int extractedElement = heap[0];
        heap[0] = heap[size - 1];
        size--;
        maxHeapify(0);
        return extractedElement;
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.printHeap();

        /*
        Mistake:
        We were iterating from 0 to size, and decreasing the value of
        size as well.

        Correction: Store the initial size of the array in a variable,
        and use the variable for iteration
         */
        System.out.println("Sorted Order: ");
        int initialSize = maxHeap.size;
        for(int i = 0; i < initialSize; i++) {
            int deletedElement = maxHeap.extractFirstElement();
            System.out.println(deletedElement);
        }
    }
}
