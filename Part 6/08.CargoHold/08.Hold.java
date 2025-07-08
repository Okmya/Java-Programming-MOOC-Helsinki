
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> holds;
    private int currWeight;

    public Hold(int weight) {
        this.maxWeight = weight;
        this.holds = new ArrayList<>();
        int currWeight = 0;

    }

    public void addSuitcase(Suitcase suitcase) {

        if (this.currWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.holds.add(suitcase);
            this.currWeight += suitcase.totalWeight();
        }

    }

    public void printItems() {

        for (Suitcase suitcase : holds) {

            suitcase.printItems();
        }

    }

    public String toString() {

        int currentWeight = 0;

        for (Suitcase suitcase : holds) {
            currentWeight += suitcase.totalWeight();
        }

        return this.holds.size() + " suitcases " + "(" + currentWeight + " kg)";
    }

}