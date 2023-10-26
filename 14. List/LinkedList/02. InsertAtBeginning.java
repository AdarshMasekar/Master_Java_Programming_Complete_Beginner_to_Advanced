package List.LinkedList;

public class InsertAtBeginning extends CustomLinkedList {

    public void addFront(int data) {
        Node newest = new Node(data);
        newest.next = head;
        head = newest;
        size++;
    }

    public static void main(String[] args) {
        InsertAtBeginning cl = new InsertAtBeginning();
        cl.addLast(50);
        cl.addLast(60);
        cl.addLast(70);
        cl.addFront(40);
        cl.addFront(30);
        cl.addFront(20);
        cl.addFront(10);

        cl.display();

    }
}
