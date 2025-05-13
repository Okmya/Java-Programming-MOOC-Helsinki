
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        //Create the Scanner
        Scanner scanner = new Scanner(System.in);
        
        //delcaring the variable and assigning user input to it
        int number = Integer.valueOf(scanner.nextLine());
        
        //Indentyfing operation and assigning variable for the result
        int result = number * number;
        
        //Print the result for user
        System.out.println(result);

    }
}
