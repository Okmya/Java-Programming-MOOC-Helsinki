
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author m.brzyska
 */
public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String userCommand = this.scanner.nextLine();

            if (userCommand.equals("1")) {
                System.out.println("Write a joke to be added:");
                String userInput = this.scanner.nextLine();
                this.manager.addJoke(userInput);
            }

            if (userCommand.equals("2")) {
                String joke = this.manager.drawJoke();
                System.out.println(joke);
            }

            if (userCommand.equals("3")) {
                this.manager.printJokes();
            }

            if (userCommand.equals("X")) {
                break;
            }

        }
    }

}
