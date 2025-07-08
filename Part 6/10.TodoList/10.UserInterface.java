
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

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            if (command.equals("add")) {
                add();

            } else if (command.equals("remove")) {
                remove();
            } else if (command.equals("list")) {
                list();
            } else if (command.equals("stop")) {
                break;
            } else {
                System.out.println("Unknown");
            }
        }
        System.out.println("Command: stop");
    }

    public void add() {
        System.out.println("To add: ");
        String elementToAdd = this.scanner.nextLine();
        this.list.add(elementToAdd);
    }

    public void remove() {
        System.out.println("Which one is removed? ");
        int numberToRemove = Integer.parseInt(this.scanner.nextLine());
        this.list.remove(numberToRemove);
    }

    public void list() {
        this.list.print();
    }

}
