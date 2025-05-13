
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int suma = first + second;
        int difference = first - second;
        int multiplication = first * second;
        double divide = 1.0*first/second;
        System.out.println(first + " + " + second + " = " + suma);
        System.out.println(first + " - " + second + " = " + difference);
        System.out.println(first + " * " + second + " = " + multiplication);
        System.out.println(first + " / " + second + " = " + divide);

        // Write your program here

    }
}
