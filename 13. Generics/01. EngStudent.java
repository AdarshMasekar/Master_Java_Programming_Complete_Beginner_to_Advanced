package Generics;

public class EngStudent extends Student {
    int roll;
    String branch, name;

    public EngStudent(String name, int roll, String branch) {
        super(name, roll);
        this.branch = branch;
        // TODO Auto-generated constructor stub
    }

    public void print() {
        super.print();
        System.out.print("and student branch is " + branch);
    }

}
