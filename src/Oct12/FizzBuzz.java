package Oct12;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in) ;
       System.out.println("Enter your input :");
       int limit = sc.nextInt();
       for(int sum = 1 ; sum <= limit ; sum++ ){
           if(sum % 3 == 0){
               System.out.println("\"Fizz\"");
           }
           else if(sum % 5 == 0){
               System.out.println("\"buzz\"");
           }
           else if(sum % 3== 0 && 5 == 0){
               System.out.println("\"Fizzbuzz\"");
           }
           else{
               System.out.println(sum);
           }
       }
    }
}
