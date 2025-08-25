package ArrayClasses;
import java.util.Arrays;
public class fill {
    public static void main(String [] args){
        int [] prime={23,45,67,89};
        int intkey = 99;
        Arrays.fill(prime,intkey);
        System.out.println(Arrays.toString(prime));
    }
}
