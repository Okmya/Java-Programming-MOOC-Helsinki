
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author m.brzyska
 */
public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        int i = 0;
        for (String task : list) {
            System.out.println((i + 1) + ": " + this.list.get(i));
            i++;
        }

    }
    
    public void remove(int number){
        this.list.remove(number - 1);
    }

}
