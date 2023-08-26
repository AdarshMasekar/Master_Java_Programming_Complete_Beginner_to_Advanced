package Object_Oriented_Programming;

public class Introduction_to_Encapsulation {
    public static void main(String[] args) {
        // Create Student objects with names and CGPA
        Student a1 = new Student("Adarsh", 8.69f);
        Student a2 = new Student("Akash", 9.85f);

        // Print details of the first student
        a1.printDetails();

        // Print details of the second student
        a2.printDetails();

        // Get and print CGPA of the first student
        System.out.println(a1.getCGPA());

        // Set new CGPA for the first student
        a1.setCGPA(8.99f);

        // Print details of the first student after CGPA update
        a1.printDetails();
    }
}

// Output:
// student details:
// name: Adarsh
// CGPA: 8.69
// student details:
// name: Akash
// CGPA: 9.85
// 8.69
// student details:
// name: Adarsh
// CGPA: 8.99
