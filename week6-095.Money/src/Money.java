
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
public Money plus(Money added) {
   Money plussed = new Money(this.euros+added.euros,this.cents+added.cents);
          
    return plussed;
}
public Money minus(Money decremented){
    double totalCents = this.euros*100 + this.cents;
    double minusCents = decremented.euros*100 + decremented.cents;
    double cents;
    double returnCents;
    double returnEuros;
    
    if (totalCents - minusCents <0){
        Money minused = new Money(0,0);
        return minused;
        }
    else {
        cents = totalCents - minusCents;
        returnCents = cents%100;
        returnEuros = cents/100;
        Money minused = new Money((int)returnEuros,(int)returnCents);
        return minused;
        }
  
}
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public boolean less(Money compared){
        if (this.euros*100+this.cents < compared.euros*100+compared.cents){
        return true;}
        else {
            return false;
        }
    }

}
