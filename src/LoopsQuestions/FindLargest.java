package LoopsQuestions;

public class FindLargest {
    public static void main(String [] args){
        int a = 10, b = 20 , c= 30 ;
        if ( a >= b && a >=c){
            System.out.println("The largest number is ="+a);
        }
        else if ( b >=a && b >=c){
            System.out.println("The Largest number is ="+b);
        }
        else {
            System.out.println("The Largest Number is ="+c);
        }
    }

}
