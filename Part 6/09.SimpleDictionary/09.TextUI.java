
import java.util.Scanner;

/**
 *
 * @author m.brzyska
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scan, SimpleDictionary book) {
        this.scanner = scan;
        this.dict = book;

    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                add();

            } else if (command.equals("search")) {
                search();

            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public void add() {
        System.out.println("Word: ");
        String word = this.scanner.nextLine();
        System.out.println("Translation: ");
        String translation = this.scanner.nextLine();
        this.dict.add(word, translation);

    }

    public void search() {
        System.out.println("To be translated: ");
        String wordToTranslate = this.scanner.nextLine();
        String translation = this.dict.translate(wordToTranslate);
        if (translation == null) {
            System.out.println("Word " + wordToTranslate + " was not found");
        } else {
            System.out.println("Translation: " + this.dict.translate(wordToTranslate));
        }
    }

}
