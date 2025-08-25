package ArrayClasses;
import java.util.Arrays;
public class Compare {
    public static void main(String [] args){
        int [] gayu = {23,45,67,89};
        int [] gayu1={23,45,78};
        System.out.println("Comparing Array 1 and Array2 ="+Arrays.compare(gayu,gayu1));
    }
}
