package Queue;

public class QueueImplementationLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        Node head = null;
        Node tail = null;

        // Check if the queue is empty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add an element to the queue
        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                tail = head = newNode; // Initialize head and tail for the first element
            } else {
                tail.next = newNode; // Link the new node at the end of the queue
                tail = newNode; // Update the tail pointer
            }
        }

        // Remove an element from the queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = head.data;
            // Handle the single-node case
            if (head == tail) {
                tail = null;
            }
            head = head.next; // Move the head pointer to the next node
            return front;
        }

        // Peek at the front of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(); // Create an instance of the Queue class
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Print and remove elements until the queue is empty
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
