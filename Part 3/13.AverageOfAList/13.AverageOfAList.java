
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        while (true) {
            //Wez liczbe od uzytkownika
            int number = Integer.valueOf(scanner.nextLine());

            //jezeli = -1 to wyjdz z while
            if (number == -1) {
                break;
            }

            //zapisz liczbe do listy
            numbers.add(number);

        }

        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;
        int count = 0;
        for (int numberToSum : numbers) {
            sum += numberToSum;
            count++;
        }

        System.out.println("Average: " + (1.0 * sum / count));
    }
}
