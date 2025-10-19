// package
package Oct19;
// public class
public class MethodArrays{
    // main method
    public static void main(String [] args){
        //declare and initialize
        int arr [] = {45,23,45,67,89,90,78,36,12};
        // method to passing arrays
        Sum(arr);
    }
    public static void Sum (int arr []){
        int Sum = 0;
        // accessing
         for (int i = 0 ; i < arr.length ; i ++)
             // calculation
              Sum += arr[i];
         System.out.println(Sum);

    }
}