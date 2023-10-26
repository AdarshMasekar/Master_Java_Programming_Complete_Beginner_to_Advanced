package List.LinkedList;

public class CustomLinkedList {

    // Inner class representing a Node in the linked list
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head, tail; // References to the first and last nodes in the linked list
    int size; // Number of elements in the linked list

    // Constructor for the CustomLinkedList
    public CustomLinkedList() {
        head = null; // Initialize head to null (empty list)
        tail = null; // Initialize tail to null (empty list)
        size = 0; // Initialize size to 0 (empty list)
    }

    // Check if the linked list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Add a new node with the given data to the end of the linked list
    public void addLast(int data) {
        Node newest = new Node(data);

        if (isEmpty()) {
            // If the list is empty, set both head and tail to the new node
            head = newest;
            tail = newest;
        } else {
            // Otherwise, set the next of the current tail to the new node and update the
            // tail
            tail.next = newest;
            tail = newest;
        }
        size++;
    }

    // Add a new node with the given data to the front of the linked list
    public void addFront(int data) {
        Node newest = new Node(data);
        if (isEmpty()) {
            // If the list is empty, set both head and tail to the new node
            head = newest;
            tail = newest;
        } else {
            // Otherwise, set the new node's next to the current head and update the head
            newest.next = head;
            head = newest;
        }
        size++;
    }

    // Get the size of the linked list
    public int size() {
        return size;
    }

    // Display the elements of the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to demonstrate the CustomLinkedList class
    public static void main(String[] args) {
        CustomLinkedList cl = new CustomLinkedList();
        cl.addLast(10);
        cl.addLast(20);
        cl.addLast(30);
        cl.addFront(40);
        cl.addFront(50);
        System.out.println(cl.size());

        System.out.println(cl.isEmpty());
        System.out.println(cl.head.data);
        System.out.println(cl.tail.data);
        cl.display();
    }
}
