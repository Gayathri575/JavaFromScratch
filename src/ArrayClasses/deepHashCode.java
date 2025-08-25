package ArrayClasses;
import java.util.Arrays;
public class deepHashCode {
    public static void main(String [] args){
        int [][] original = {{20,30,40,50,}};
        int [] [] chinaBrand = {{20,30,40,50,}};
        System.out.println(Arrays.deepHashCode(original));
        System.out.println(Arrays.deepHashCode(chinaBrand));

    }
}
