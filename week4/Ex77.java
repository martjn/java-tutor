package week4;

class LyyraCard {
  private double balance;

  public LyyraCard(double balanceAtStart) {
    this.balance = balanceAtStart;
  }

  public String toString() {
    return "The card has " + this.balance + " euros.";
  }

  public void payEconomical() {
    if (this.balance >= 2.50) {
      this.balance -= 2.50;

    }
  }

  public void payGourmet() {
    if (this.balance >= 4.00) {
      this.balance -= 4.00;

    }
  }

  public void loadMoney(double amount) {
    if (this.balance + amount > 150) {
      this.balance = 150;
    } else if (amount < 0) {
      ;
    } else {
      this.balance += amount;
    }
  }
}

public class Ex77 {
  public static void main(String[] args) {
    LyyraCard cardPekka = new LyyraCard(20);
    LyyraCard cardBrian = new LyyraCard(30);

    cardPekka.payGourmet();
    cardBrian.payEconomical();
    System.out.println("Pekka: " + cardPekka);
    System.out.println("Brian: " + cardBrian);

    cardPekka.loadMoney(20);
    cardBrian.payGourmet();
    System.out.println("Pekka: " + cardPekka);
    System.out.println("Brian: " + cardBrian);

    cardPekka.payEconomical();
    cardPekka.payEconomical();
    cardBrian.loadMoney(50);

    System.out.println("Pekka: " + cardPekka);
    System.out.println("Brian: " + cardBrian);

  }
}
