package week4;

class Account {
  String name;
  double amount;

  Account(String getName, double getAmount) {
    this.name = getName;
    this.amount = getAmount;
  }

  public void withdrawal(double value) {
    if (this.amount > value) {
      this.amount -= value;
    } else {
      System.out.println("Not enough money");
    }
  }

  public void deposit(double value) {
    this.amount += value;
  }

  public double balance() {
    return this.amount;
  }
}

public class Ex72 {

  public static void transfer(Account from, Account to, double amount) {
    if (from.balance() < amount) {
      System.out.println("Transaction failed: not enough money.");
    } else {
      from.withdrawal(amount);
      to.deposit(amount);

    }
  }

  public static void main(String[] args) {
    Account account1 = new Account("account1", 100.00);
    Account account2 = new Account("account2", 500.00);

    System.out.println("account1 balance: " + account1.balance());
    System.out.println("account2 balance: " + account2.balance());

    System.out.println("running transfer from account 1 to account 2: ");

    transfer(account1, account2, 52.00);

    System.out.println("account1 balance: " + account1.balance());
    System.out.println("account2 balance: " + account2.balance());

  }
}
