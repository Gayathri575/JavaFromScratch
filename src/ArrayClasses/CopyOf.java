package ArrayClasses;
import java.util.Arrays;
public class CopyOf {
    public static void main(String [] args){
        int [] copy = {10,20,30,40,50,60,};
        System.out.println("CopyOf copy is = ");
        System.out.println("\n");
        System.out.println(Arrays.toString(Arrays.copyOf(copy,5)));
    }
}
