package LoopsQuestions;
public class EvenOrOdd{
    public static void main(String [] args){
        for (int number = 1 ; number <= 50 ; number ++) {
            if (number % 2 != 0) continue;
            System.out.println("This is an Even number =" + number);
        }
    }
}