package Classes_and_Objects;

public class Complex {
    int real, imaginary;

    // Constructor for the Complex class
    Complex(int real, int imaginary) {
        this.real = real; // here this is used to remove confusion between local variable real and global
                          // variable local same for next variable imaginary
        this.imaginary = imaginary;
    }

    // Method to print the complex number
    void print() {
        System.out
                .println("The value real part is : " + this.real + " and value of imaginary part is " + this.imaginary);
    }

    // Method to add two complex numbers and print the result
    void add(Complex c) {
        System.out.println(
                "result after addition is : " + ((this.real + c.real) + "+i" + (this.imaginary + c.imaginary)));
    }
}
