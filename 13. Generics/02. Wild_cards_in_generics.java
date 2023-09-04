package Generics;

import java.util.ArrayList;

public class Wild_cards_in_generics {

    public static void print(ArrayList<?> a) {
        for (Object o : a) {
            if (o instanceof Student) {
                Student s = (Student) o;
                s.print();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> a1 = new ArrayList<>();
        a1.add(new Student("adarsh", 1));
        a1.add(new Student("abhi", 5));
        ArrayList<EngStudent> a2 = new ArrayList<>();
        a2.add((new EngStudent("akash", 45, "EE")));
        a2.add((new EngStudent("amul", 12, "ME")));
        print(a1);
        print(a2);
    }
}
