
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                if (scanner.equals("")) {
                    break;
                }
                String line = scanner.nextLine();
                String[] data = line.split(",");
                String name = data[0];
                int number = Integer.valueOf(data[1]);

                //Tworzymy obiekt Person person do listyF
                Person person = new Person(name, number);
                persons.add(person);

            }
        } catch (Exception e){
            System.out.println("Error has occured.");}

        return persons;

    }
}
