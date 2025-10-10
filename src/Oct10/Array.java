package Oct10;

public class Array {
    public static void main(String [] args){
        //Array declaration
        int [] marks = {99,45,67,28,90};
        //Access Elemnts
        System.out.println("First mark :"+marks[0]);
        System.out.println("fail mark  :"+marks[4]);
        //Print Length
        System.out.println("Total Subjects :"+marks.length);
        for(int i = 0; i<marks.length ; i ++){
            System.out.println("Subject " + (i+1)  + " : " + marks [i] );
        }
    }
}
