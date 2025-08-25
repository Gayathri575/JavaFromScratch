package ArrayClasses;
import java.util.Arrays;
public class Equals {
    public static void main(String [] args){
        int [][] jump = {{1,2,3,4,5,6,}};
        int [][] jump2 = {{1,2,3,4,9,6}};
        System.out.println(Arrays.equals(jump,jump2));
    }
}
