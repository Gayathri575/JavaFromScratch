package Oct14;
//three types of method calling
// 1. user defined method
//2. Abstract Method (no body , Only declaration )
//3.Prebuild Method (already in library )
// 4. Static method
public class userDefined {
    // method call
    public void methodCalling(){
        System.out.println("Im the Type 1 - of Method calling ( User defined");
    }
    //main method
    public static void main(String [] args){
        // obj creation
        userDefined m1 = new userDefined();
        // obj call
        m1.methodCalling();
    }
}
