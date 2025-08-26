package August25;

public class StringMethod {
        public static void main(String[] args) {
            String s = "Hello, World!";

            // 1. length()
            System.out.println("1. Length: " + s.length());

            // 2. charAt()
            System.out.println("2. charAt(7): " + s.charAt(7));

            // 3. substring(int i)
            System.out.println("3. substring(7): " + s.substring(7));

            // 4. substring(int i, int j)
            System.out.println("4. substring(7, 12): " + s.substring(7, 12));

            // 5. concat()
            System.out.println("5. concat: " + s.concat("!!!"));

            // 6. indexOf(String s)
            System.out.println("6. indexOf(\"World\"): " + s.indexOf("World"));

            // 7. indexOf(String s, int i)
            System.out.println("7. indexOf(\"l\", 4): " + s.indexOf("l", 4));

            // 8. lastIndexOf(String s)
            System.out.println("8. lastIndexOf(\"l\"): " + s.lastIndexOf("l"));

            // 9. equals(Object obj)
            System.out.println("9. equals(\"Hello, World!\"): " + s.equals("Hello, World!"));

            // 10. equalsIgnoreCase(String anotherString)
            System.out.println("10. equalsIgnoreCase(\"hello, world!\"): " + s.equalsIgnoreCase("hello, world!"));

            // 11. compareTo(String anotherString)
            System.out.println("11. compareTo(\"Hello, Java!\"): " + s.compareTo("Hello, Java!"));

            // 12. compareToIgnoreCase(String anotherString)
            System.out.println("12. compareToIgnoreCase(\"hello, java!\"): " + s.compareToIgnoreCase("hello, java!"));

            // 13. toLowerCase()
            System.out.println("13. toLowerCase: " + s.toLowerCase());

            // 14. toUpperCase()
            System.out.println("14. toUpperCase: " + s.toUpperCase());

            // 15. trim()
            String s2 = "   Hello, Trim!   ";
            System.out.println("15. trim: '" + s2.trim() + "'");

            // 16. replace()
            System.out.println("16. replace('l','x'): " + s.replace('l', 'x'));

            // 17. contains()
            System.out.println("17. contains(\"World\"): " + s.contains("World"));

            // 18. toCharArray()
            System.out.print("18. toCharArray: ");
            char[] chars = "Hello".toCharArray();
            for (char c : chars) {
                System.out.print(c + " ");
            }
            System.out.println();

            // 19. startsWith()
            System.out.println("19. startsWith(\"Hello\"): " + s.startsWith("Hello"));
        }
    }


