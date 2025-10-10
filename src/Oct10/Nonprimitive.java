package Oct10;

// Step 1 // Class declaration
class Vehicle {
    String name;
    int model;
    int year;

    // Step 2 // Constructor
    Vehicle(String name, int model, int year) {
        this.name = name;  // class variable = parameter value
        this.model = model;
        this.year = year;
    }

    // Step 3 // Method
    void print() {
        System.out.println("Bike name: " + name + ", Bike Model: " + model + ", Launched year: " + year);
    }
}

// Step 4 // Main class
public class Nonprimitive {
    public static void main(String [] args) {

        // Step 5 // Object creation
        Vehicle v1 = new Vehicle("Pulzar", 9, 2008);

        // Step 6 // Call method
        v1.print();
    }
}
