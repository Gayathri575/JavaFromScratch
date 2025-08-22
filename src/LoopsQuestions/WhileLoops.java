package LoopsQuestions;
import java.util.*;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Check the Number is divisible by 5");
        System.out.println(" Enter the Number  ");

        while (true) {
            int num1 = sc.nextInt();
            if (num1 % 5 == 0) {
                System.out.println("The number is divided by 5 ");
                break;
            } else {
                System.out.println("The number is not divide by 5");

            }
        }
        sc.close();
    }
}