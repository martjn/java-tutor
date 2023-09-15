package week5;

class LyyraCard {
  private double balance;

  public LyyraCard(double balance) {
    this.balance = balance;
  }

  public double balance() {
    return this.balance;
  }

  public void loadMoney(double amount) {
    this.balance += amount;
  }

  public boolean pay(double amount) {
    if (this.balance >= amount) {
      this.balance -= amount;
      return true;
    } else {
      return false;
    }
  }
}

class CashRegister {
  private double cashInRegister; // the amount of cash in the register
  private int economicalSold; // the amount of economical lunches sold
  private int gourmetSold; // the amount of gourmet lunches sold

  public CashRegister() {
    // at start the register has 1000 euros
    this.cashInRegister = 1000;
  }

  public double payEconomical(double cashGiven) {
    // the price of the economical lunch is 2.50 euros
    double price = 2.50;
    if (cashGiven >= price) {
      this.economicalSold++;
      this.cashInRegister += price;
      return cashGiven - price;
    } else {
      return cashGiven;
    }
  }

  public double payGourmet(double cashGiven) {
    double price = 4.00;
    if (cashGiven >= price) {
      this.gourmetSold++;
      this.cashInRegister += price;
      return cashGiven - price;
    } else {
      return cashGiven;
    }
  }

  public boolean payEconomical(LyyraCard card) {
    double price = 2.50;
    if (card.balance() >= price) {
      this.economicalSold++;
      card.pay(price);
      return true;
    } else {
      return false;
    }
  }

  public boolean payGourmet(LyyraCard card) {
    double price = 4.00;
    if (card.balance() >= price) {
      this.gourmetSold++;
      card.pay(price);
      return true;
    } else {
      return false;
    }
  }

  public void loadMoneyToCard(LyyraCard card, double sum) {
    if(sum > 0){
      card.loadMoney(sum);
      cashInRegister += sum;
    }
  }

  public String toString() {
    return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold
        + " gourmet lunches sold: " + gourmetSold;
  }
}

public class Ex86 {
  public static void main(String[] args) {
    CashRegister unicafeExactum = new CashRegister();
    System.out.println( unicafeExactum );

    LyyraCard cardOfJim = new LyyraCard(2);

    System.out.println("the card balance " + cardOfJim.balance() + " euros");

    boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
    System.out.println("payment success: " + succeeded);

    unicafeExactum.loadMoneyToCard(cardOfJim, 100);

    succeeded = unicafeExactum.payGourmet(cardOfJim);
    System.out.println("payment success: " + succeeded);

    System.out.println("the card balance " + cardOfJim.balance() + " euros");

    System.out.println( unicafeExactum );
}
}
