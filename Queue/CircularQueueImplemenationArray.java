package Queue;

public class CircularQueueImplemenationArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            Queue.size = n; // Correct static access
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front; // Correct modulo calculation for circular queue
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Full Queue");
                return; // Prevent adding to a full queue
            }

            if (front == -1) {
                front = 0; // Initialize front when the first element is added
            }

            rear = (rear + 1) % size; // Circular increment
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                return -1; // Return -1 for empty queue
            }

            int result = arr[front];
            if (rear == front) {
                // Single element case
                rear = front = -1;
            } else {
                front = (front + 1) % size; // Circular increment
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1; // Return -1 for empty queue
            }
            return arr[front]; // Peek at the front of the queue
        }
    }

    public static void main(String[] args) {
        new Queue(5); // Initialize the static array with size 5

        Queue.add(1); // Static method accessed using the class name
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        Queue.add(5);
        System.out.println(Queue.remove()); // Corrected the call
        Queue.add(6);
        System.out.println(Queue.remove()); // Corrected the call
        Queue.add(7);

        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
