package Object_Oriented_Programming;

// Main class for demonstrating inheritance
public class Introduction_to_Inheritance {
    public static void main(String[] args) {
        // Create an instance of MountainBike
        MountainBike mb = new MountainBike(10, 10, 10, 20);

        // Increase speed and set height
        mb.speedUp(20);
        mb.setHeight(22);

        // Print initial details of the mountain bike
        System.out.println(mb.printDetails());

        // Apply brake and print details again
        mb.applyBreakk(10);
        System.out.println(mb.printDetails());

        // Access protected member method
        mb.printProtectedMember();
    }
}
