package week6;

class Money {

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

  public String toString() {
    String zero = "";
    if (cents <= 10) {
      zero = "0";
    }

    return euros + "." + zero + cents + "e";
  }

  public Money plus(Money added) {
    return new Money(this.euros + added.euros(), this.cents + added.cents());
  }

  public Money minus(Money decremented) {
    int newEuros = this.euros - decremented.euros();
    int newCents = this.cents - decremented.cents();
    if (newEuros < 0) {
      return new Money(0, 0);
    } else if(newCents < 0) {

      return new Money(newEuros-1, 100 + newCents);
    }
    else{
      return new Money(newEuros, newCents);
    }
  }

  public boolean less(Money compared) {
    if (this.euros < compared.euros()) {
      return true;
    } else {
      if (this.cents < compared.cents()) {
        return true;
      } else {
        return false;
      }
    }
  }
}

public class Ex95 {
  public static void main(String[] args) {
    Money a = new Money(10, 0);
    Money b = new Money(3, 50);

    Money c = a.minus(b);

    System.out.println(a); // 10.00e
    System.out.println(b); // 3.50e
    System.out.println(c); // 6.50e

    c = c.minus(a); // NOTE: new Money-object is created and reference to that is assigned to
                    // variable c
                    // the Money object 6.50e that variable c used to hold, is not referenced
                    // anymore

    System.out.println(a); // 10.00e
    System.out.println(b); // 3.50e
    System.out.println(c); // 0.00e

  }
}
