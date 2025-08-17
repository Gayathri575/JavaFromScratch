package Week1proj;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if(choice >= 1 && choice <= 5) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
            } else {
                break;  // Exit loop
            }

            switch(choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if(num2 != 0){
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                case 5:
                    if(num2 != 0){
                        result = num1 % num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot find modulus by zero!");
                    }
                    break;
                default:
                    System.out.println("Exiting calculator. Bye!");
            }

        } while(choice != 6);

        sc.close();
    }
}