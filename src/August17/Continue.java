package August17;

public class Continue {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {
                    continue; // skip 3
                }
                System.out.println(i); // prints 1 2 4 5
            }
        }
    }


