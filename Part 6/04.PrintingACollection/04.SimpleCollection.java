
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        String printOutput = "The collection " + this.name  + " is empty.";
        String thisElements = "";
        
        if (this.elements.isEmpty()) {
            return printOutput;
        }
        
        if (this.elements.size() == 1){
            thisElements = "The collection " + this.name + " has " + this.elements.size() + " element:\n" + elements.get(0);
            return thisElements;
        
        }
        

        thisElements = "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
        for (String element : elements) {
            thisElements += element + "\n";

        }
        
        return thisElements;
    }

}
