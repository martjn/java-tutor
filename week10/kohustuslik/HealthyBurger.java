package week10.kohustuslik;

public class HealthyBurger extends Hamburger {
  String healthyExtra1Name;
  double healthyExtra1Price;
  String healthyExtra2Name;
  double healthyExtra2Price;

  public HealthyBurger(String _meat, double _price){
    super("Healthy", _meat, _price, "Brown rye");
    this.healthyExtra1Name = "";
    this.healthyExtra1Price = 0;
    this.healthyExtra2Name = "";
    this.healthyExtra2Price = 0;
    
  }

  public void addHealthyAddition1(String name, double price){
    this.healthyExtra1Name = name;
    this.healthyExtra1Price = price;
    System.out.println("Added " + name + " for an extra " + price);
  }
  public void addHealthyAddition2(String name, double price){
    this.healthyExtra2Name = name;
    this.healthyExtra2Price = price;
    System.out.println("Added " + name + " for an extra " + price);
  }

  @Override
  public double itemizeHamburger(){
    return this.price + this.healthyExtra1Price + this.healthyExtra2Price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
  }

}
