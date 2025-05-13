
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //utworz liste do przeczytania linii w pliku
        ArrayList<String> lines = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean check = false;
        try (Scanner scan = new Scanner(Paths.get(file))) {
            //read all the lines of the line
            while (scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }
        } catch (Exception e) {

            System.out.println("Reading the file " + file + " failed.");
            check = true;
        }

        while (true) {

            if (check == true) {
                break;
            }

            if (lines.contains(searchedFor)) {
                System.out.println("Found!");
                break;
            } else {
                System.out.println("Not found.");
                break;
            }
        }

    }
}
