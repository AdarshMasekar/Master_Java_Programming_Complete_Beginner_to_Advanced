package Classes_and_Objects;

public class Intro_to_Classes {
    public static void main(String[] args) {
        // Creating a new Complex object c1 with real=10 and imaginary=20
        Complex c1 = new Complex(10, 20);

        // Calling the print() method on c1 to display its values
        c1.print();

        // Creating another Complex object c2 with real=40 and imaginary=50
        Complex c2 = new Complex(40, 50);

        // Calling the add() method on c1, passing c2 as an argument, and displaying the
        // result
        c1.add(c2);
    }
}

// Output:
// The value real part is : 10 and value of imaginary part is 20
// result after addition is : 50+i70
