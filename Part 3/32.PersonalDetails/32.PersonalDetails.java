
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longestName = 0;
        int sum = 0;
        int count = 0;
        int name = 0;
        String nameToPrint = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int yearOfBirth = Integer.valueOf(parts[1]);
            sum += yearOfBirth;

            name = parts[0].length();
            if (name > longestName) {
                longestName = name;
                nameToPrint = parts[0];

            }
            count++;
        }

        System.out.println("Longest name: " + nameToPrint);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
