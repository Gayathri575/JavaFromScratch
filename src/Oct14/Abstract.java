package Oct14;

// Abstract class declare
abstract class Animal {
    // Abstract method (no body)
    abstract void Sound();
}

// Dog class extends Animal
class Dog extends Animal {
    @Override
    void Sound() {
        System.out.println("I'm able to bark ");
    }

    void fetch() {
        System.out.println("I'm able to fetch the ball 🎾");
    }
}

// Cat class extends Animal
class Cat extends Animal {
    @Override
    void Sound() {
        System.out.println("I'm able to Meowwwww ");
    }

    void sleep() {
        System.out.println("I'm able to sleep for a month ");
    }
}

// Main method
public class Abstract {
    public static void main(String[] args) {
        // Parent reference, child object
        Animal A1 = new Dog();
        Animal A2 = new Cat();

        // Call overridden method
        A1.Sound(); // Dog sound
        A2.Sound(); // Cat sound

        // instanceof + downcasting to access child-specific methods
        if (A1 instanceof Dog) {
            Dog D = (Dog) A1;
            D.fetch();
        }

        if (A2 instanceof Cat) {
            Cat C = (Cat) A2;
            C.sleep();
        }
    }
}
