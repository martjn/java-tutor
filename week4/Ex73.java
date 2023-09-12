package week4;

class Product {
  String name;
  double price;
  int amount;

  Product (String nameAtStart, double priceAtStart, int amountAtStart){
    this.name = nameAtStart;
    this.price = priceAtStart;
    this.amount = amountAtStart;
  }

  public void printProduct(){
    System.out.println(this.name + ", price: " + this.price + ", amount: " + this.amount);
  }
}

public class Ex73 {

  public static void main(String[] args){
    Product test_product = new Product("Apple", 0.95, 12);
    test_product.printProduct();
  }
}
