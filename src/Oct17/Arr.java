package Oct17;
import java.util.Arrays;
import java.util.Collections;

public class Arr{
    public static void main(String [] args){
        //initialize and declare
        Integer [] arr = {88,46,347,90,2,17,0 , 78,34,89};
        // array length
        System.out.print("Arrays Length :"+ arr.length);
        //Original Arrays
        System.out.println(" ");
        System.out.print("Original Arrays List: "+ Arrays.toString(arr) );
        //Ascending order
        System.out.println(" ");
        Arrays.sort(arr);
        System.out.print("Ascending Order: "+ Arrays.toString(arr) );
        //Descending Order
        System.out.println(" ");
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("Descending Order :" +Arrays.toString(arr));
    }
}