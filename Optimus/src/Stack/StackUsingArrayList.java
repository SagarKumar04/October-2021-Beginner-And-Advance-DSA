package Stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    private ArrayList<Integer> stackArray;

    public StackUsingArrayList() {
        stackArray = new ArrayList<Integer>();
    }

    private void push(int data) {
        stackArray.add(data);
        System.out.println("Element pushed");
    }

    private void pop() {
        if(stackArray.isEmpty()) {
            System.out.println("Underflow");
        }
        else {
            int lastElementIndex = stackArray.size() - 1;
            System.out.println("Popped Element: " + stackArray.get(lastElementIndex));
            stackArray.remove(lastElementIndex);
        }
    }

    private void peek() {
        int lastElementIndex = stackArray.size() - 1;
        System.out.println("Peeked Element: " + stackArray.get(lastElementIndex));
    }

    private void traverse() {
        System.out.println("Stack: " + stackArray);
    }

    public static void main(String[] args) {
        StackUsingArrayList stack = new StackUsingArrayList();

        stack.pop();

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
