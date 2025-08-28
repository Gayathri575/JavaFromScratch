package StringMethod;

public class Compare {
    public static void main (String [] args){
        String Hello = "Good morning";
        System.out.println(Hello.compareTo("Good Afternoon"));
        System.out.println(Hello.compareToIgnoreCase("good afternoon"));
    }
}
