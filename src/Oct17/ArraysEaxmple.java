package Oct17;

public class ArraysEaxmple {
    // step 1 main method
    public static void main(String [] args){
        // Declaring arrys
        int [] arr = {23,78,90,45,23,56,35,67};
        // Length of an arrays
        System.out.println("Length :" + arr.length);
        // access the elements
        for(int hen = 0 ; hen < arr.length ; hen++){
            System.out.print(arr[hen] + " ");
        }
        //updatig the elements
        for(int hen = 0 ; hen < arr.length ; hen ++){
            arr[hen] = arr[hen] *3 ;
        }
        // print updated arrays
    for (int hen = 0 ; hen < arr.length ; hen ++){
        System.out.print(arr[hen] + " ");

    }


    }
}
