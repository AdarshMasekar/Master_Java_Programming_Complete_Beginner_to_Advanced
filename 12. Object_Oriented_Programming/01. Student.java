package Object_Oriented_Programming;

public class Student {
    String name;

    private float CGPA;

    Student(String name, float CGPA) {
        this.name = name;
        this.CGPA = CGPA;
    }

    public float getCGPA() {
        return this.CGPA;
    }

    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }

    public void printDetails() {
        System.out.println("student details: " + "\n");
        System.out.println("name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

}
