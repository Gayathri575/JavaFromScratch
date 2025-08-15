package August15;

public class Variables {

        // 1. Static variable (shared by all objects)
        static String staticVar = "I am static";

        // 2️. Instance variable (each object has its own copy)
        String instanceVar;

        // Constructor to initialize instance variable
        public Variables(String value) {
            this.instanceVar = value;
        }

        public void showVariables() {
            // 3️. Local variable (exists only inside this method)
            String localVar = "I am local";
            System.out.println("Local Variable: " + localVar);
            System.out.println("Instance Variable: " + instanceVar);
            System.out.println("Static Variable: " + staticVar);
        }

        public static void main(String[] args) {

            // Access static variable directly
            System.out.println("Accessing static variable directly: " + staticVar);
            System.out.println("----------");

            // Create first object
            Variables obj1 = new Variables("I am obj1 instance");
            obj1.showVariables();
            System.out.println("----------");

            // Create second object
            Variables obj2 = new Variables("I am obj2 instance");
            obj2.showVariables();
            System.out.println("----------");

            // Changing static variable
            staticVar = "Static changed!";
            System.out.println("After changing static variable:");
            obj1.showVariables();
            obj2.showVariables();
        }
    }


