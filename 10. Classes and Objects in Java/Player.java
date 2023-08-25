package Classes_and_Objects;

public class Player {
    String name;
    int id;
    static int pc = 0; // This static variable counts the number of Player instances created

    // Constructor for the Player class
    Player(String name) {
        this.name = name;
        this.id = ++pc; // Assign a unique id to each player instance
    }

    // Static method to get the value of the static variable 'pc'
    static int getPC() {
        return pc; // Returns the count of Player instances created so far
    }
}
