
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
public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;
    private int startWeight;

    public Suitcase(int weight) {
        this.items = new ArrayList<>();
        this.maxWeight = weight;
        this.startWeight = 0;

    }

    public void addItem(Item item) {
        if (this.startWeight + item.getWeight() <= this.maxWeight) {
            items.add(item);
            this.startWeight += item.getWeight();
        }
    }

    public void printItems() {
        String itemsToPrint = "";
        for (Item item : items) {
            itemsToPrint += item.getName() + " (" + item.getWeight() + "kg)\n";
        }

        System.out.println(itemsToPrint);

    }

    public int totalWeight() {
        return this.startWeight;
    }

    public Item heaviestItem() {

        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);

        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;

            }
        }

        return heaviest;

    }
    

    @Override
    public String toString() {

        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item " + "(" + this.startWeight + " kg)";
        } else {
            return this.items.size() + " items " + "(" + this.startWeight + " kg)";
        }
    }

}
