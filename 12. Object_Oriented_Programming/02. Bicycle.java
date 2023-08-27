package Object_Oriented_Programming;

// Bicycle class representing a basic bicycle
public class Bicycle {
    // Properties of the Bicycle class
    public int gear; // Number of gears
    public int speed; // Current speed
    protected int price; // Price of the bicycle

    // Constructor to initialize Bicycle properties
    public Bicycle(int gear, int speed, int price) {
        this.gear = gear;
        this.speed = speed;
        this.price = price;
    }

    // Method to decrease speed by a given value
    public void applyBreakk(int decrement) {
        this.speed -= decrement;
    }

    // Method to increase speed by a given value
    public void speedUp(int increment) {
        this.speed += increment;
    }

    // Method to print details of the Bicycle
    public String printDetails() {
        return ("Speed is: " + this.speed + "\nNumber of gears: " + this.gear +
                "\nPrice is: " + this.price); // this.price is only accessible in this class
    }
}
