package Object_Oriented_Programming;

// MountainBike class extending Bicycle class
class MountainBike extends Bicycle {
    public int seatHeight;

    // Constructor with additional parameter for seatHeight
    public MountainBike(int gear, int speed, int price, int seatHeight) {

        // Call the constructor of the parent class (Bicycle)
        // using the super keyword to initialize shared properties
        super(gear, speed, price);

        // Initialize the seatHeight specific to MountainBike
        this.seatHeight = seatHeight;
    }

    // Method to set the seat height of the MountainBike
    public void setHeight(int height) {
        this.seatHeight = height;
    }

    // Override the printDetails method from the parent class
    @Override
    public String printDetails() {
        // Call the parent class's printDetails method using super
        // and add the seatHeight information specific to MountainBike
        return (super.printDetails() + "\nSeat height is: " + this.seatHeight);
    }

    // Method to access a protected member of the parent class
    public void printProtectedMember() {
        // Access the protected member 'price' from the parent class (Bicycle)
        System.out.println("Price is: " + super.price);
    }
}
