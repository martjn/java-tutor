package week10.kohustuslik;

public class DeluxeBurger extends Hamburger {
  public DeluxeBurger() {
    super("Deluxe", "Sausage & Bacon", 14.54, "White");
    addHamburgerAddition1("dummy", 0);
    addHamburgerAddition2("dummy", 0);
  }

  @Override
  public void addHamburgerAddition1(String name, double price) {
    if (this.addition1Name.isEmpty()) {
      this.addition1Name = "Chips";
      this.addition1Price = 2.75;
      System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
    } else {
      System.out.println("Cannot add additional items to a deluxe burger");
    }
  }

  @Override
  public void addHamburgerAddition2(String name, double price) {
    if (this.addition2Name.isEmpty()) {
      this.addition2Name = "Drink";
      this.addition2Price = 1.81;
      System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
    } else {
      System.out.println("Cannot add additional items to a deluxe burger");
    }
  }

  @Override
  public void addHamburgerAddition3(String name, double price) {

    System.out.println("Cannot add additional items to a deluxe burger");
  }
  @Override
  public void addHamburgerAddition4(String name, double price) {

    System.out.println("Cannot add additional items to a deluxe burger");
  }

}
