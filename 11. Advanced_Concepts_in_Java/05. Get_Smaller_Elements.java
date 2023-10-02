package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Get_Smaller_Elements {
    // This method removes elements greater than or equal to 'x' from the ArrayList
    static void getSmallerElements(ArrayList<Integer> al, int x) {
        Iterator<Integer> it = al.iterator();

        while (it.hasNext()) {
            int num = it.next();
            if (num >= x) {
                it.remove(); // Removes elements greater than or equal to 'x'
            } else {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(146);
        al.add(25);
        al.add(14);
        al.add(75);
        al.add(65);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a threshold value: ");
        int x = sc.nextInt();

        System.out.println("Elements smaller than " + x + ":");
        getSmallerElements(al, x);
    }
}

// output:
// 100
// 15 25 14 75 65
