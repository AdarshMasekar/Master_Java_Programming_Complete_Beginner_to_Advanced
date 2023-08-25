package Classes_and_Objects;

public class Access_Modifiers {
    public static void main(String[] args) {
        // Creating an instance of the Access_helper class
        Access_helper ah = new Access_helper();

        // Uncommenting the following line would result in an error because 'name' is
        // private
        // System.out.println(ah.name);

        // Accessing the 'age' variable (which is default visibility) and assigning a
        // value
        ah.age = 10;

        // Calling the 'print()' method from the Access_helper instance
        ah.print();

        // Calling the 'age()' method from the Access_helper instance
        ah.age();
    }
}
