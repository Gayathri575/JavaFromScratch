package ArrayClasses;
import java.util.Arrays;
public class mismatch {
    public static void main(String [] args){
        int [] arr = {90,67,89,45};
        int [] arr1= {90,67,89,90};
        System.out.println(Arrays.mismatch(arr,arr1));
    }
}
