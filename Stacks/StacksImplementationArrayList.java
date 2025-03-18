package Stacks;

import java.util.ArrayList;

public class StacksImplementationArrayList {
    static ArrayList<Integer> list = new ArrayList<>();

    // Check if the stack is empty
    public static boolean isEmpty() {
        return list.size() == 0;
    }

    // Push element onto the stack
    public static void push(int data) {
        list.add(data);
    }

    // Pop element from the stack
    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop.");
            return -1;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    // Peek at the top element of the stack
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot peek.");
            return -1;
        }
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        // Demonstrating stack operations
        System.out.println("Pushing elements onto the stack:");
        push(10);
        push(20);
        push(30);

        System.out.println("Stack after pushes: " + list);

        System.out.println("Peeking the top element: " + peek());

        System.out.println("Popping elements from the stack:");
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());

        System.out.println("Stack after pops: " + list);

        System.out.println("Attempting to pop from an empty stack: " + pop());
    }
}
 