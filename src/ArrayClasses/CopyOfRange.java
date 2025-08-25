package ArrayClasses;
import java.util.Arrays;
public class CopyOfRange {
    public static void main (String [] args){
        int [] learning = {56,34,78,90,123,67};
        System.out.println("Copying Array From the Range ="+(  Arrays.toString(Arrays.copyOfRange(learning, 2 , 20))));
    }
}
