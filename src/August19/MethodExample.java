package August19;
public class MethodExample {

    // 1. Method without parameters and without return type
    void sayHello() {
        System.out.println("Hello, Welcome to Java Methods!");
    }

    // 2. Method with parameters and without return type
    void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 3. Method without parameters but with return type
    int getLuckyNumber() {
        return 7;
    }

    // 4. Method with parameters and with return type
    int addNumbers(int a, int b) {
        return a + b;
    }

    // main method to run the program
    public static void main(String[] args) {
        // create object of MethodExample class
        MethodExample obj = new MethodExample();

        // call method 1
        obj.sayHello();

        // call method 2
        obj.greetUser("Steve");

        // call method 3
        int lucky = obj.getLuckyNumber();
        System.out.println("Your lucky number is: " + lucky);

        // call method 4
        int sum = obj.addNumbers(10, 20);
        System.out.println("Sum of numbers = " + sum);
    }
}
