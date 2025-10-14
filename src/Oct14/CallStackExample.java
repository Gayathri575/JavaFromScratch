package Oct14;
public class CallStackExample {

    public static void main(String[] args) {
        System.out.println("Main starts");
        firstMethod();  // Step 1: call firstMethod
        System.out.println("Main ends");
    }

    static void firstMethod() {
        System.out.println("Inside firstMethod");
        secondMethod();  // Step 2: call secondMethod
        System.out.println("Exiting firstMethod");
    }

    static void secondMethod() {
        System.out.println("Inside secondMethod");
        thirdMethod();   // Step 3: call thirdMethod
        System.out.println("Exiting secondMethod");
    }

    static void thirdMethod() {
        System.out.println("Inside thirdMethod");
        // No further method call
        System.out.println("Exiting thirdMethod");
    }
}
