package Strings;
// Import statements and package declaration could be here

// The class to demonstrate the use of StringBuilder
public class StringBuilder_Intro {
    public static void main(String[] args) {

        // Creating two strings s1 and s2
        String s1 = "hello";
        String s2 = s1;

        // Modifying s2 by appending " adarsh"
        s2 = s2 + " adarsh"; // Changes made to s2 create a new memory block to store the new value

        // Comparing the references of s1 and s2
        System.out.println(s1 == s2); // Outputs: false (different memory blocks for s1 and modified s2)

        // Creating two StringBuilder instances sb1 and sb2
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = sb1;

        // Modifying sb2 by appending " Adarsh"
        sb2 = sb2.append(" Adarsh"); // Changes made to sb2 reflect into sb1 as they refer to the same memory block

        // Comparing the references of sb1 and sb2
        System.out.println(sb1 == sb2); // Outputs: true (same memory block for sb1 and modified sb2)
    }
}
