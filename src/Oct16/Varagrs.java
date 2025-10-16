package Oct16;
public class Varagrs{
    static void names(String... Animal){
        for(String G : Animal){
            System.out.println(G + " ");
        }
        System.out.println( );
    }
    static void numbers(int... Number){
       // calculation
        int total = 0;
        for(int T : Number){
            total += T ;
        }
        System.out.println("Total :"+ total);
    }
    // main class
    public static void main(String [] args){
        names("Cat", "Dog");
        names("Cheetah", "Deer");
        numbers(99,90,78);
        numbers(67,45,34,25);
    }
}