
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word:");
        String phrase = scanner.nextLine();
        System.out.println(phrase + phrase + phrase);

    }
}
