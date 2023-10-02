package Streams_and_Lambda;

public class Student {
    int rollNumber, marks;
    String name;

    public Student(String n, int r, int m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}
