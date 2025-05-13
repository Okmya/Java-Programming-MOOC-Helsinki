
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //create variable sum 
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");

            //assign user input to variable number
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else {
                sum = sum + number;
            }

        }
        //print the sum of all numbers
        System.out.println("Sum of the numbers: " + sum);
    }
}
