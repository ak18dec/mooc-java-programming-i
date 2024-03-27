
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
        Money newMoney = new Money(this.euros+addition.euros(), this.cents + addition.cents());
        return newMoney;
    }

    public boolean lessThan(Money compared) {

        int totalOwnCents = this.euros() * 100 + this.cents();
        int totalOtherCents = compared.euros * 100 + compared.cents();

        return totalOwnCents < totalOtherCents;

        
    }

    // 3.30 - 1.50 = 1.80
    public Money minus(Money decreaser) {
        int totalOwnCents = this.euros() * 100 + this.cents();
        int totalOtherCents = decreaser.euros * 100 + decreaser.cents();

        int diffCents = totalOwnCents - totalOtherCents;

        if(diffCents < 0) {
            return new Money(0, 0);
        }

        return new Money(0, diffCents);
        
    }

}
