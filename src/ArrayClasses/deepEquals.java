package ArrayClasses;
import java.util.Arrays;
public class deepEquals {
    public static void main(String[] args){
        int [][] value1 = {{23,45,90}};
        int [] [] value2 = {{23,45,90}};
        System.out.println(Arrays.deepEquals(value1,value2));


    }
}
