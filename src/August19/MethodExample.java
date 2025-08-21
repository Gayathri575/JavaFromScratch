package August19;
//explaning Stack(LIFO)
public class MethodExample{
    public static void D(){
        System.out.println("Im going to dead");

    }
    public static void C(){
        System.out.println("Im the LastOne");
        D();

    }
    public static void B() {
        System.out.println("Im the SecondOne");
        C();
    }
    public static void A() {
        System.out.println("Hurry im the first One");
        B();
    }
    public static void main(String [] args){
        A();

    }

}