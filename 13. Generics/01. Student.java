package Generics;

public class Student {
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void print() {
        System.out.println("Student name is " + name + " and student roll is " + roll);
    }
}
