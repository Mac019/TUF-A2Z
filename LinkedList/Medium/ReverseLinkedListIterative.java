package LinkedList.Medium;

class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head; // Reference to the first node in the list

    // Add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Point the new node to the current head
        head = newNode; // Update head to the new node
    }

    // Add a node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) { // If the list is empty, set head to the new node
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) { // Traverse to the last node
            temp = temp.next;
        }
        temp.next = newNode; // Link the new node at the end
    }

    // Remove a node from the beginning
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        System.out.println("Deleting first element: " + head.data);
        head = head.next; // Move head to the next node
    }

    // Remove a node from the end
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head.next == null) { // If there's only one node
            System.out.println("Deleting last element: " + head.data);
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) { // Traverse to the second-to-last node
            temp = temp.next;
        }
        System.out.println("Deleting last element: " + temp.next.data);
        temp.next = null; // Remove the reference to the last node
    }

    // Reverse the linked list using iterative approach
    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Display the elements of the list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class ReverseLinkedListIterative {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements using addFirst and addLast
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        // Display the list
        System.out.println("After adding elements:");
        list.display();

        // Reverse the list
        list.reverseList();
        System.out.println("After reversing the list:");
        list.display();

        // Remove the first element
        list.deleteFirst();
        System.out.println("After deleting the first element:");
        list.display();

        // Remove the last element
        list.deleteLast();
        System.out.println("After deleting the last element:");
        list.display();

        // Add more elements
        list.addFirst(50);
        list.addLast(60);
        System.out.println("After adding elements at the beginning and end:");
        list.display();

        // Reverse the list again
        list.reverseList();
        System.out.println("After reversing the list again:");
        list.display();

        // Remove elements again
        list.deleteFirst();
        list.deleteLast();
        System.out.println("After deleting the first and last elements again:");
        list.display();
    }
}