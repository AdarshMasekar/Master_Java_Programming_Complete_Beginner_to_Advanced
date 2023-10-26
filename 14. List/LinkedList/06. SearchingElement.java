package List.LinkedList;

// Import the CustomLinkedList class, which appears to be a parent class
public class SearchingElement extends CustomLinkedList {

    // Method to search for an element in the linked list
    public boolean search(int data) {
        if (isEmpty()) {
            System.out.println("Linked list is empty!");
        } else {
            Node temp = head; // Start from the head of the linked list
            while (temp != null) {
                if (temp.data == data) { // If the data in the current node matches the search data
                    return true; // Return true, indicating that the data is found
                }
                temp = temp.next; // Move to the next node in the linked list
            }
        }
        return false; // If the data is not found after traversing the entire list, return false
    }

    public static void main(String[] args) {
        SearchingElement cl = new SearchingElement(); // Create an instance of the SearchingElement class
        cl.addLast(10); // Add elements to the linked list
        cl.addLast(20);
        cl.addLast(50);
        cl.addLast(80);
        cl.addLast(30);

        System.out.println(cl.search(20)); // Search for the element 20 and print the result

        System.out.println(cl.search(55)); // Search for the element 55 and print the result
    }
}
