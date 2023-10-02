package Streams_and_Lambda;

import java.util.Arrays;

public class Average_of_the_student_marks {
    public static void main(String[] args) {

        Student arr[] = {
                new Student("Abhijeet", 1, 88),
                new Student("adarsh", 3, 86),
                new Student("Anusha", 6, 99)
        };

        double res = Arrays.stream(arr)
                .mapToInt(student -> student.getMarks())
                .average()
                .getAsDouble();

        System.out.println("Average marks of the students is : " + res);
    }
}
