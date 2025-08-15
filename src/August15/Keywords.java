package August15;

    public class Keywords { // 'public' and 'class' are keywords

        static int number = 10; // 'static' and 'int'

        public static void main(String[] args) {

            final double PI = 3.14159; // 'final' means constant
            boolean isJavaFun = true; // 'boolean' is a primitive type keyword

            if (isJavaFun) { // 'if' is a conditional keyword
                System.out.println("Java is fun!");
            } else { // 'else' keyword
                System.out.println("Java is not fun!");
            }

            for(int i = 0; i < 5; i++) { // 'for' loop keyword
                System.out.println("Loop iteration: " + i);
            }

            int result = addNumbers(5, 10); // calling method
            System.out.println("Sum: " + result);
        }

        // 'public', 'static', 'int' keywords
        public static int addNumbers(int a, int b) {
            return a + b; // 'return' keyword
        }
    }
