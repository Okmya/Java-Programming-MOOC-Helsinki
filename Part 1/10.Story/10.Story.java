
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        // create a tool for reading, assignt it to variable caller scanner
        Scanner scanner = new Scanner(System.in);
        // Print a message
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        // Read users input
        String first = scanner.nextLine();
        // print another message
        System.out.println("What is their job?");
        //read another user input
        String second = scanner.nextLine();
        //print the story
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + first + ", who was " + second + ".");
        System.out.println("On the way to work, " + first + " reflected on life.");
        System.out.println("Perhaps " + first + " will not be " + second + " forever.");

        // Write your program here

    }
}
