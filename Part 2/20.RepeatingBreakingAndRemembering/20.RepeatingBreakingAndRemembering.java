
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        //variables
        int numberOfNumbers = 0;
        int sum = 0;
        int numberFromUser = 0;
        int evenNumber = 0;
        int oddNumber = 0;

        //while number from user is not -1 do the loop
        while (true) {
            System.out.println("Give numbers:");
            numberFromUser = Integer.valueOf(scanner.nextLine());

            //if number from user is -1 break the loop
            if (numberFromUser == -1) {
                break;
            }

            sum += numberFromUser;
            numberOfNumbers += 1;

            if (numberFromUser % 2 == 0) {
                evenNumber += 1;
            } else {
                oddNumber += 1;
            }

        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + (1.0 * sum / numberOfNumbers));
        System.out.println("Even: " + evenNumber);
        System.out.println("Odd: " + oddNumber);

    }
}
