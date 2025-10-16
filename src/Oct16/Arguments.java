package Oct16;

public class Arguments {
    public static void main(String [] args){
        if(args.length > 0 ) {
            System.out.println("Comment line arguments found");
            for(String val : args){
                System.out.println(args);
            }

        }
        else {
            System.out.println("No arguments found");
        }
    }
}
