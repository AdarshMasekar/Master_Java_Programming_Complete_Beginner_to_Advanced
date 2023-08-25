package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Separate_Even_Odd {
    // Method to separate even and odd numbers from the ArrayList
    static void separateEvenOdd(ArrayList<Integer> al) {
        ArrayList<Integer> even = new ArrayList<>();

        // Using an Iterator to traverse the ArrayList and separate even numbers
        Iterator<Integer> it = al.iterator();
        System.out.print("Odd numbers are: ");
        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                even.add(num);
                it.remove(); // Remove even numbers from the original ArrayList
            } else {
                System.out.print(num + " ");
            }
        }

        // Using an Iterator to print the separated even numbers
        Iterator<Integer> it2 = even.iterator();
        System.out.print("\nEven numbers are: ");
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(14);
        al.add(12);
        al.add(85);
        al.add(82);
        al.add(34);
        al.add(41);

        separateEvenOdd(al);
    }
}

// output:
// Odd numbers are: 15 85 41
// Even numbers are: 14 12 82 34
