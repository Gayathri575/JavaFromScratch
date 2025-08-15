package August15;

public class StringConcatenation {
        public static void main(String[] args) {
            String firstName = "Steve";
            String lastName = "R";

            // Concatenation using '+'
            String fullName = firstName + " " + lastName; // adding space between names
            System.out.println("Full Name: " + fullName);

            // Concatenating String with numbers
            int age = 19;
            String info = fullName + " is " + age + " years old.";
            System.out.println(info);
        }
    }


