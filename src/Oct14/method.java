package Oct14;

public class method {
    // method creation
    public void random(){
        System.out.println("Im calling Method");
    }
    public void numbers(){
        System.out.println("Im second Method Name ");
    }
    //main method-entry point
    public static void main(String [] args){
        // obj creation
        // className objName = new className
        method r1 = new method();
        method r2 = new method();
        // call the method using created obj
        r2.numbers();
    }

}
