
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int numberFromUser = Integer.valueOf(scanner.nextLine());
            if (numberFromUser == 0) {
                break;
            } else {
                numberOfNumbers = numberOfNumbers + 1;
                sum = sum + numberFromUser;
            }
        }
        double averageOfNumbers = 1.0 * sum / numberOfNumbers;
        System.out.println("Average of the numbers: " + averageOfNumbers);

    }
}
