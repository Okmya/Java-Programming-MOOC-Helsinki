
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros();
        int totalCents = this.cents + addition.cents();

        Money newMoney = new Money(totalEuros, totalCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {

        int totalCents = 0;
        int totalEuros = 0;

        int decreaserEuro = decreaser.euros();
        int decreaserCents = decreaser.cents();

        totalEuros = this.euros - decreaserEuro;

        if (this.cents < decreaser.cents()) {

            totalEuros -= 1;
            totalCents = 100 - (decreaserCents - this.cents);

        } else {
            totalCents = this.cents - decreaserCents;

        }

        if (totalCents < 0 || totalEuros < 0) {
            totalCents = 0;
            totalEuros = 0;
        }

        Money newMoneyMinus = new Money(totalEuros, totalCents);

        return newMoneyMinus;

    }

}
