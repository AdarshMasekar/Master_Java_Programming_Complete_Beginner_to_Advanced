package Strings;

public class String_Builder_and_String_Buffer_methods {

    public static void main(String[] args) {
        // Create a new StringBuilder instance with initial content "Adarsh"
        StringBuilder sb1 = new StringBuilder("Adarsh");

        // Append " Masekar" to the existing content of StringBuilder
        sb1.append(" Masekar");

        // Print the content of StringBuilder after appending
        System.out.println(sb1);

        // Reverse the content of StringBuilder and print the reversed version
        System.out.println(sb1.reverse());

        // Set the character at index 1 to 'z' in the StringBuilder
        sb1.setCharAt(1, 'z');

        // Print the content of StringBuilder after modifying the character
        System.out.println(sb1);

        // Delete characters from index 0 (inclusive) to 5 (exclusive) from
        // StringBuilder
        System.out.println(sb1.delete(0, 5));

        // Insert character 'o' at index 3 in the StringBuilder
        sb1.insert(3, 'o');

        // Print the final content of StringBuilder
        System.out.println(sb1);
    }
}
