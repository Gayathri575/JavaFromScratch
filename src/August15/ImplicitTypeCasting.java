package August15;

    public class ImplicitTypeCasting {
        public static void main(String[] args) {
            // 1. int to long
            int i = 100;
            long l = i; // automatic conversion
            System.out.println("int i = " + i);
            System.out.println("long l = " + l);

            // 2. int to float
            float f = i; // automatic conversion
            System.out.println("float f = " + f);

            // 3. float to double
            double d = f; // automatic conversion
            System.out.println("double d = " + d);

            // 4. char to int
            char c = 'A';
            int charToInt = c; // automatic conversion, ASCII value
            System.out.println("char c = " + c);
            System.out.println("char to int = " + charToInt);
        }
    }


