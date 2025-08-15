package August16;

public class Logicaloperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // && (AND)
        System.out.println("(a > 5 && b < 10) : " + (a > 5 && b < 10)); // true && true = true
        System.out.println("(a > 5 && b > 10) : " + (a > 5 && b > 10)); // true && false = false

        // || (OR)
        System.out.println("(a > 5 || b > 10) : " + (a > 5 || b > 10)); // true || false = true
        System.out.println("(a < 5 || b > 10) : " + (a < 5 || b > 10)); // false || false = false

        // ! (NOT)
        System.out.println("!(a > 5) : " + !(a > 5)); // !true = false
        System.out.println("!(b > 10) : " + !(b > 10)); // !false = true
    }
}
