package August20;

public class Arrays {
        public static void main(String[] args) {
            int[] marks = {85, 90, 78, 88, 76};

            System.out.println("Marks are: ");
            for(int i = 0; i < marks.length; i++) {
                System.out.println("Subject " + (i+1) + ": " + marks[i]);
            }

            // Sum of array
            int sum = 0;
            for(int num : marks) {
                sum += num;
            }
            System.out.println("Total Marks = " + sum);
        }
    }


