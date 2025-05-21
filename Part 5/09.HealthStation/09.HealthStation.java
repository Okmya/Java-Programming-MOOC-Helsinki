
import java.util.HashSet;
import java.util.Set;

public class HealthStation {

    private int visitors;

    public HealthStation() {
        this.visitors = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the 
        visitors++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int current_weight = person.getWeight();
        person.setWeight(current_weight + 1);

    }

    public int weighings() {
        return this.visitors;

    }

}
