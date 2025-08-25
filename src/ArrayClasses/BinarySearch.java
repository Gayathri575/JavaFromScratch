package ArrayClasses;
import java.util.*;
public class BinarySearch {
    public static void main(String [] args){
        int [] arr = {10,20,30,40,50};
        Arrays.sort(arr);
        int Intkey = 30 ;
        System.out.println( "Found at index ="+ Arrays.binarySearch(arr,Intkey));

    }
}
