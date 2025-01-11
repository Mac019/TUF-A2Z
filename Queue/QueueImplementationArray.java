package Queue;

public class QueueImplementationArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            Queue.size = n; // Updated to use static access
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Full Queue");
                return; // Prevent adding to a full queue
            }

            rear++;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1]; // Corrected from == to =
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        new Queue(5); // No need to assign this to an object since methods are static

        Queue.add(1); // Static method accessed using the class name
        Queue.add(2);
        Queue.add(3);

        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
