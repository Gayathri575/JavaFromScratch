package Oct12;
import java.util.Scanner;

public class N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit (N): ");
        int n = sc.nextInt();

        System.out.println("Natural numbers from 1 to " + n + " are:");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
