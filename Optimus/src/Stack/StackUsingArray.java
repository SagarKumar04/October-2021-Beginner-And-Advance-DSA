package Stack;

import java.util.Arrays;

public class StackUsingArray {
    private int top;
    private int stackArray[];
    private int maxSize;

    public StackUsingArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    private void push(int data) {
        Arrays.sort(stackArray);

        if(top == maxSize - 1) {
            System.out.println("Overflow");
        }
        else {
            stackArray[++top] = data;
            System.out.println("Element pushed");
        }
    }

    private void pop() {
        if(top == -1) {
            System.out.println("Underflow");
        }
        else {
            System.out.println("Popped Element: " + stackArray[top--]);
        }
    }

    private void peek() {
        System.out.println("Element at top: " + stackArray[top]);
    }

    private void traverse() {
        System.out.println("Elements in stack: ");
        for(int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(50);
        stack.push(100);
        stack.push(20);
        stack.push(90);
        stack.push(70);
        stack.push(700);

        stack.traverse();

        stack.pop();
        stack.traverse();

        stack.peek();
        stack.traverse();

        stack.pop();
        stack.traverse();

        stack.pop();
        stack.traverse();

        stack.pop();
        stack.traverse();

        stack.pop();
        stack.traverse();

        stack.pop();
        stack.traverse();
    }
}
