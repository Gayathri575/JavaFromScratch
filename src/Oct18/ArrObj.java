package Oct18;

// Car class
class Car {
    String model;
    int year;

    // constructor
    Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    // method to display details
    void display(){
        System.out.println("Car Model: " + model + " | Car Year: " + year);
    }
}

// Main class
public class ArrObj {
    public static void main(String[] args){
        // array declaration and initialization
        Car[] cars = new Car[5];

        // assigning objects
        cars[0] = new Car("Toyota", 1990);
        cars[1] = new Car("Audi", 1991);
        cars[2] = new Car("Fortuner", 1992);
        cars[3] = new Car("Jaguar", 1993);
        cars[4] = new Car("Benz", 1994);

        // loop through array and display
        for(int i = 0; i < cars.length; i++){
            cars[i].display();
        }
    }
}
