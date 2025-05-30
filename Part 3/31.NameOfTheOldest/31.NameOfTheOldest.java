
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String oldestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);

            if (age > oldestAge) {
                oldestAge = age;
                oldestName = parts[0];
            }

        }

        System.out.println("Age of the oldest: " + oldestName);

    }
}
