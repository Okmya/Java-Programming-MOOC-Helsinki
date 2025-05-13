
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> numbers = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                numbers.add(scan.nextLine());
            }

        } catch (Exception e) {
            System.out.println("File does not exists.");
        }

        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = Integer.valueOf(numbers.get(i));
            if (number >= lowerBound && number <= upperBound) {
                count += 1;

            }

        }

        System.out.println("Numbers: " + count);

    }

}
