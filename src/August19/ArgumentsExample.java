package August19;

public class ArgumentsExample {

        // Method with two parameters
        void displayInfo(String name, int age) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        // Method with one parameter
        void square(int number) {
            int result = number * number;
            System.out.println("Square of " + number + " = " + result);
        }

        public static void main(String[] args) {
            // Create object
            ArgumentsExample obj = new ArgumentsExample();

            // Passing arguments (actual values) to the method
            obj.displayInfo("Steve", 19);   // "Steve" and 19 are arguments
            obj.square(5);                 // 5 is an argument
        }
    }

