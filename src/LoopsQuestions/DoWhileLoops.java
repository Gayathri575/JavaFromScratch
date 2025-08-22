package LoopsQuestions;
import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number; // declare once
        String result = "";

        do {
            System.out.println("Enter a number (Negative to stop):");
            number = sc.nextInt(); // assign value, do NOT redeclare

            if (number >= 0) {
                result += number + " "; // store numbers
            }

        } while (number >= 0);

        System.out.println("You entered: " + result);
        sc.close();
    }
}
