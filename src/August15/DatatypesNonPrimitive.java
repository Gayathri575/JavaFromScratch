package August15;
public class DatatypesNonPrimitive {
    public static void main(String[] args) {

        // 1. String - sequence of characters (non-primitive)
        String name = "Steve";
        System.out.println("String value: " + name);
        System.out.println("String length: " + name.length()); // method example

        // 2. Array - collection of same type elements
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Array elements: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 3. Class object - user-defined object
        Person person1 = new Person("Steve", 19);
        person1.displayInfo();

        // 4. Wrapper classes - non-primitive versions of primitive types
        Integer numObj = 100; // int -> Integer
        Double doubleObj = 20.99; // double -> Double
        System.out.println("Integer object: " + numObj);
        System.out.println("Double object: " + doubleObj);

        // 5. Interface example
        Vehicle myCar = new Car();
        myCar.start();
    }
}

// User-defined class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Interface
interface Vehicle {
    void start();
}

// Class implementing interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started!");
    }
}
