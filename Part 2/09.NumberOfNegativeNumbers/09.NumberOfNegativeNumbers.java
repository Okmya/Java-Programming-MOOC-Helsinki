
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        //create scanner to get user input
        Scanner scanner = new Scanner(System.in);
        //count to calculate number of negative numbers
        int count = 0;
        //loop 
        while (true) {
            //print for user 
            System.out.println("Give a number:");
            //assign user number to variable 
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) { // if number is 0, exit program
                break;
            } else if (number < 0) { // if number is below zero, add one to count
                count = count + 1;
            }
        }
        //print number of negative numbers user wrote
        System.out.println("Number of negative numbers: " + count);
    }
}
