package List.LinkedList;

public class DeleteElementAtBeginning extends InsertAtAnyPosition {

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is Empty");
        } else {
            head = head.next;
            size--;
        }
    }

    public static void main(String[] args) {
        DeleteElementAtBeginning cl = new DeleteElementAtBeginning(); // Create an instance of the InsertAtAnyPosition
                                                                      // class
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

        try {
            cl.removeFirst();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("deleting the element at beginning");
        cl.display(); // Display the final updated linked list

    }

}
