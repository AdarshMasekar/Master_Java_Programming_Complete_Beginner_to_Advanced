package List.ArrayList;
import java.util.ArrayList;

public class ArrayList_Traversal {

    // Using traditional for loop and get() method
    static void usingForLoop(ArrayList<String> al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

    // Using enhanced for-each loop
    static void usingForEachLoop(ArrayList<String> al) {
        for (String name : al) {
            System.out.print(name + " ");
        }
    }

    // Using Iterator
    static void usingIterator(ArrayList<String> al) {
        java.util.Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.length() < 5) {
                it.remove(); // Removes short names from the ArrayList
            } else {
                System.out.print(name + " ");
            }
        }
    }

    // Using forEach method
    static void usingForEachMethod(ArrayList<String> al) {
        al.forEach(name -> {
            System.out.print(name + " ");
        });
    }

    public static void main(String[] args) {
        // There are a total of 4 ways to traverse an ArrayList

        ArrayList<String> al = new ArrayList<>();
        al.add("adarsh");
        al.add("akash");
        al.add("vicky");
        al.add("raghu");
        al.add("manju");
        al.add("somu");
        al.add("pandari");

        System.out.println("Printed using for loop and get() method:");
        usingForLoop(al); // Calls the method to traverse using for loop
        System.out.println("\n");

        System.out.println("Printed using enhanced for-each loop:");
        usingForEachLoop(al); // Calls the method to traverse using enhanced for-each loop
        System.out.println("\n");

        System.out.println("Printed using Iterator:");
        usingIterator(al); // Calls the method to traverse using Iterator
        System.out.println("\n");

        System.out.println("Printed using forEach method:");
        usingForEachMethod(al); // Calls the method to traverse using forEach method
        System.out.println("\n");
    }
}


// output:

// Printed using for
// loop and

// get() method:
// adarsh akash vicky raghu manju somu pandari

// Printed using enhanced for-each loop:
// adarsh akash vicky raghu manju somu pandari

// Printed using Iterator:
// adarsh akash vicky raghu manju pandari

// Printed using forEach method:
// adarsh akash vicky raghu manju pandari
