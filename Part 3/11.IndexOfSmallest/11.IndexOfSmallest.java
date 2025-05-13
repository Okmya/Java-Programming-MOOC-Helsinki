
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 9999) {
                break;
            }
            list.add(number);
        }
        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallestNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int numberFromList = list.get(i);
            if (smallestNumber > numberFromList) {
                smallestNumber = numberFromList;

                System.out.println("Found at index: " + i);
            }
        }
        System.out.println("Smallest number: " + smallestNumber);
    }
}
