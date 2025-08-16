package August17;

public class Break {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {
                    break; // stop loop when i = 3
                }
                System.out.println(i); // prints 1 2
            }
        }
    }


