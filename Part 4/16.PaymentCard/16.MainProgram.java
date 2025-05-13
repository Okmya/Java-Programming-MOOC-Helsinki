
public class MainProgram {

    public static void main(String[] args) {
        //create cards
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        // eats heartily and affordably
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        // print values
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        //add money
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        //print values
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        //eats affordably
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        mattsCard.addMoney(50);

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // write code here
    }
}
