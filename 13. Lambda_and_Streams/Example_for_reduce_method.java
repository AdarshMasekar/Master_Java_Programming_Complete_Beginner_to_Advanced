package Streams_and_Lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Example_for_reduce_method {
    public static void main(String[] args) {
        Student arr[] = {
                new Student("Abhijeet", 1, 88),
                new Student("adarsh", 3, 86),
                new Student("Anusha", 6, 99)
        };

        // code to store the the name and marks of students in an map
        Map<String, Integer> map = new HashMap<>();
        map = Arrays.stream(arr)
                .collect(Collectors.toMap(Student::getName, Student::getMarks));

        for (String name : map.keySet()) {
            System.out.println(name + " -> " + map.get(name));
        }
    }
}
