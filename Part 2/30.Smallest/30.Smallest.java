
public class Smallest {

    public static int smallest(int number1, int number2) {
        // Write some code here
        // don't print anything inside this method
        // there must be a return in the end of the method
        int smallestNumber = 0;
        if (number1 > number2) {
            smallestNumber = number2;
        } else {
            smallestNumber = number1;
        }
        return smallestNumber;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
