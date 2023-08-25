package Classes_and_Objects;

public class Access_helper {
    private String name = "Adarsh Masekar"; // only accesible inside this class untill we write getter function

    protected int age = 23; // accesible only inside this class and the inherited and subclasses of this
                            // class

    public void print() { // can be accessed from anywhere
        System.out.println(name);
    }

    void age() { // default : can be accessed from same package only
        System.out.println(age);
    }

}
