
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;

    }

    public void addNumber(int number) {
        // write code here
        this.count += 1;
        this.sum += number;

    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (count == 0) {
            return 0;
        }

        return 1.0 * this.sum / this.count;
    }
}
