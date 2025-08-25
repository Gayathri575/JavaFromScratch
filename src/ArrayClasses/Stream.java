package ArrayClasses;
import java.util.Arrays;
public class Stream {
 public static void main(String [] args){
     int [] arreybhai = {23,45,67,89,12,34,56,78,90,99};
     Arrays.stream(arreybhai).forEach(System.out::println);
 }
}
