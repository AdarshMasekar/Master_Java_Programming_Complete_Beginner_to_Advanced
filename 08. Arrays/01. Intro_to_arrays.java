package Arrays;

public class Intro_to_arrays {
    public static void main(String[] args) {

        // syntax to create an array with size 10;
        int[] a = new int[10];

        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + 10;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("Element at index " + i + " is: " + a[i]);
        }

    }
}

// Element at index 0 is: 0
// Element at index 1 is: 10
// Element at index 2 is: 20
// Element at index 3 is: 30
// Element at index 4 is: 40
// Element at index 5 is: 50
// Element at index 6 is: 60
// Element at index 7 is: 70
// Element at index 8 is: 80
// Element at index 9 is: 90
