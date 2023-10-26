package List.LinkedList;

// Import the DeleteElementAtBeginning class, which appears to be a parent class
public class DeleteElementAtEnd extends DeleteElementAtBeginning {

    // Method to remove the last element from the linked list
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!");
        } else {
            Node temp = head;

            // Traverse to the second-to-last node
            while (temp.next.next != null) {
                temp = temp.next;
            }

            tail = temp; // Update the tail to the new last node
            temp.next = null; // Remove the last node by setting its next to null
            size--;
        }
    }

    public static void main(String[] args) {
        DeleteElementAtEnd cl = new DeleteElementAtEnd(); // Create an instance of DeleteElementAtEnd
        // Add elements to the linked list
        cl.addLast(50);
        cl.addLast(60);
        cl.addLast(70);
        cl.addFront(40);
        cl.addFront(30);
        cl.addFront(10);

        System.out.println("Before insertion of 20");
        cl.display(); // Display the linked list

        cl.insertAtPosition(20, 2); // Insert 20 at the 2nd position
        System.out.println("After insertion of 20");
        cl.display(); // Display the updated linked list

        System.out.println(cl.size);
        System.out.println(cl.tail.data);

        cl.removeLast(); // Remove the last element
        System.out.println("Deleting the element at the end");
        cl.display(); // Display the final updated linked list

        System.out.println(cl.size);
        System.out.println(cl.tail.data);
    }
}
