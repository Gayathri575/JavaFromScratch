package Oct19;
// class
class good {
    //instance variable
    int age;
    String name;

    // constructor
    good(int age , String name ){
        this.age = age;
        this.name = name;
    }
}
//class
public class ObjectArray{
    // main method
    public static void main(String [] args){
        // declare arrays
        good [] Arrays ;
        // allocate memory
        Arrays = new good[5];
        // initialize values
        Arrays[0] = new good(1, "aman");
        Arrays[1] = new good(2, "vaibhav");
        Arrays[2] = new good(3, "shikar");
        Arrays[3] = new good(4, "dharmesh");
        Arrays[4] = new good(5, "mohit");

        // accesing
        for(int i = 0 ; i < Arrays.length ; i ++){
            System.out.println( Arrays[i].name + " " +Arrays[i].age +" ");
        }

    }
}