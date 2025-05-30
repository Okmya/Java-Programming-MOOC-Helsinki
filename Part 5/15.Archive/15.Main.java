
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String givenName = scanner.nextLine();
            if (givenName.isEmpty()) {
                break;
            }

            Item item = new Item(id, givenName);

            if (items.contains(item)) {
                continue;
            } else {
                items.add(item);
            }
        }

        System.out.println("==Items==");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

    }
}
