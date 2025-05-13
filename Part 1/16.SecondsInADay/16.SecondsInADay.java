
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int minutes = 60;
        int seconds = 60;
        int hours = 24;
        int calculateSecondsInDay = Integer.valueOf( scanner.nextLine()) * minutes * hours * seconds ;
        System.out.println(calculateSecondsInDay);

    }
}
