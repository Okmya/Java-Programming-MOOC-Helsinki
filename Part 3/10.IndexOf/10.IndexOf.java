
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int numberToSearch = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            int numberFromList = list.get(i);
            if (numberFromList == numberToSearch) {
                System.out.println(numberToSearch + " is at index " + i);
            }

        }
    }
}
