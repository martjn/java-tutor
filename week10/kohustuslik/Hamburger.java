package week10.kohustuslik;

public class Hamburger {
  String name;
  String meat;
  double price;
  String breadRollType;

  String addition1Name;
  double addition1Price;
  String addition2Name;
  double addition2Price;
  String addition3Name;
  double addition3Price;
  String addition4Name;
  double addition4Price;

  public Hamburger(String _name, String _meat, double _price, String _breadRollType){
    this.name = _name;
    this.meat = _meat;
    this.price = _price;
    this.breadRollType = _breadRollType;
    this.addition1Name = "";
    this.addition1Price = 0;
    this.addition2Name = "";
    this.addition2Price = 0;
    this.addition3Name = "";
    this.addition3Price = 0;
    this.addition4Name = "";
    this.addition4Price = 0;
    System.out.println(_name + " hamburger on a " + _breadRollType + " roll with " + _meat + ", price is " + _price);
  }

  public void addHamburgerAddition1(String name, double price){
    this.addition1Name = name;
    this.addition1Price = price;
    System.out.println("Added " + name + " for an extra " + price);
  }
  public void addHamburgerAddition2(String name, double price){
    this.addition2Name = name;
    this.addition2Price = price;
    System.out.println("Added " + name + " for an extra " + price);
  }
  public void addHamburgerAddition3(String name, double price){
    this.addition3Name = name;
    this.addition3Price = price;
    System.out.println("Added " + name + " for an extra " + price);
  }
  public void addHamburgerAddition4(String name, double price){
    this.addition4Name = name;
    this.addition4Price = price;
    System.out.println("Added " + name + " for an extra " + price);
  }

  public double itemizeHamburger(){
    return this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
  }
}
