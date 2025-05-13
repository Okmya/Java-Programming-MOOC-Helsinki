
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int n = Integer.valueOf(scanner.nextLine());
        int suma = 1;
        for (int i = 1; i <= n; i++) {
            suma *= i;
        }
        System.out.println("Factorial: " + suma);
    }
}
