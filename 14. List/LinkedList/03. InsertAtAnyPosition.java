package List.LinkedList;

// Import the InsertAtBeginning class, which appears to be a parent class
public class InsertAtAnyPosition extends InsertAtBeginning {

    // Method to insert a node with the given data at a specified position in the
    // linked list
    public void insertAtPosition(int data, int position) {
        Node newest = new Node(data); // Create a new node with the provided data
        Node temp = head; // Start from the head of the linked list

        // Traverse the list to find the node just before the specified position
        while (position > 2) { // Position starts from 1, so it is decremented by 1 to get the previous node
            position--;
            temp = temp.next; // Move to the next node
        }

        // Perform the insertion by updating pointers of the previous and new nodes
        newest.next = temp.next; // Set the next of the new node to the node at the specified position
        temp.next = newest; // Update the next of the previous node to the new node
        size++;
    }

    // Main method to demonstrate the InsertAtAnyPosition class
    public static void main(String[] args) {
        InsertAtAnyPosition cl = new InsertAtAnyPosition(); // Create an instance of the InsertAtAnyPosition class
        cl.addLast(50); // Add elements to the linked list
        cl.addLast(60);
        cl.addLast(70);
        cl.addFront(40);
        cl.addFront(30);
        cl.addFront(10);
        System.out.println("before insertion of 20");
        cl.display(); // Display the linked list

        cl.insertAtPosition(20, 2); // Insert 20 at the 2nd position
        System.out.println("after insertion of 20");
        cl.display(); // Display the updated linked list

        cl.insertAtPosition(55, 6); // Insert 55 at the 6th position
        System.out.println("after insertion of 55 at 6th position");
        cl.display(); // Display the final updated linked list
    }
}
