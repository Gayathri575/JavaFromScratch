package August15;

public class DatatypesPrimitive {
    public static void main (String [] args){
        // 1. byte - 8-bit integer (-128 to 127)
        byte b = 100;
        System.out.println("Byte value: " + b);

        // 2. short - 16-bit integer (-32,768 to 32,767)
        short s = 20000;
        System.out.println("Short value: " + s);

        // 3. int - 32-bit integer (-2^31 to 2^31-1)
        int i = 100000;
        System.out.println("Int value: " + i);

        // 4. long - 64-bit integer (-2^63 to 2^63-1)
        long l = 1000000000L;  // L suffix required
        System.out.println("Long value: " + l);

        // 5. float - 32-bit decimal
        float f = 10.5f;  // f suffix required
        System.out.println("Float value: " + f);

        // 6. double - 64-bit decimal
        double d = 20.99;
        System.out.println("Double value: " + d);

        // 7. char - single character
        char c = 'A';
        System.out.println("Char value: " + c);

        // 8. boolean - true or false
        boolean flag = true;
        System.out.println("Boolean value: " + flag);

    }
}
