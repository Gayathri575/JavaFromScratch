package ArrayClasses;
import java.util.Arrays;
public class BinarySearchRange {
    public static void main(String [] args){
        int range[] = {10,20,304,65,78,90};
        Arrays.sort(range);
        int intKey = 78;
        System.out.println("Find the index ="+ Arrays.binarySearch(range,1 , 4 , intKey));
    }
}
