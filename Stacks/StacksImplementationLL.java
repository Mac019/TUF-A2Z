package Stacks;

public class StacksImplementationLL {
    // Node class to represent each element in the stack
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head;

        // Check if the stack is empty
        public static boolean isEmpty() {
            return head == null;
        }

        // Push a new element onto the stack
        public static void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Pop the top element from the stack
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty, cannot pop.");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek at the top element without removing it
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty, cannot peek.");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        // Push elements onto the stack
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);

        // Peek at the top element
        System.out.println("Top element: " + Stack.peek());

        // Pop and print all elements
        System.out.println("Popping elements:");
        while (!Stack.isEmpty()) {
            System.out.println(Stack.pop());
        }

        // Attempt to peek and pop from an empty stack
        System.out.println("Peek when stack is empty: " + Stack.peek());
        System.out.println("Pop when stack is empty: " + Stack.pop());

        // Push elements again
        Stack.push(50);
        Stack.push(60);
        System.out.println("Top element after pushing again: " + Stack.peek());
    }
}
