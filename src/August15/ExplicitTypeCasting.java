package August15;
 class Animal {
        void eat() {
            System.out.println("Animal eats");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    public class ExplicitTypeCasting {
        public static void main(String[] args) {
            System.out.println("=== Upcasting Example ===");
            // Upcasting: Dog object → Animal reference (implicit)
            Animal a = new Dog();
            a.eat();       // works
            // a.bark();   //  cannot access subclass methods

            System.out.println("\n=== Downcasting Example ===");
            // Downcasting: Animal reference → Dog reference (explicit)
            if (a instanceof Dog) {  // safe check
                Dog d = (Dog) a;
                d.eat();  // inherited method
                d.bark(); // subclass method
            }

            System.out.println("\n=== Unsafe Downcasting Example ===");
            Animal a2 = new Animal();
            if(a2 instanceof Dog) {
                Dog d2 = (Dog) a2; // safe because of instanceof
                d2.bark();
            } else {
                System.out.println("Cannot downcast a2 to Dog!");
            }
        }
    }


