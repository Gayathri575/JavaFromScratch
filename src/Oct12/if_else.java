package Oct12;
import java.util.Scanner;
public class if_else {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("You Entered Negative Number");
        }
        if(num < 0){
            System.out.println("You Entered Positive Number");
        }
        else{
            System.out.println("you entered Zero");
        }
        sc.close();
    }
}
