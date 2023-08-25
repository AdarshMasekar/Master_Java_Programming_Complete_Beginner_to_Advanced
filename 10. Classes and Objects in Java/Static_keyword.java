package Classes_and_Objects;

public class Static_keyword {
    public static void main(String[] args) {
        // Calling the static method 'getPC()' of the Player class using the class name
        // No need to create an object to access static methods
        System.out.println(Player.getPC());

        // Creating a Player object named p1 with the name "Adarsh"
        Player p1 = new Player("Adarsh");

        // Calling the instance method 'getPC()' using the object p1
        // This is possible but not recommended, as static methods are usually called
        // using the class name
        System.out.println(p1.getPC());
    }
}

// output:
// 0
// 1