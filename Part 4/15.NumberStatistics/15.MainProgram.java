
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int numberFromUser = Integer.valueOf(scanner.nextLine());
            if (numberFromUser == -1) {
                break;
            } else {

                if (numberFromUser % 2 == 0) {
                    statisticsEven.addNumber(numberFromUser);
                }
                if (numberFromUser % 2 == 1) {
                    statisticsOdd.addNumber(numberFromUser);
                }

                statistics.addNumber(numberFromUser);

            }

        }

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }

}
