package week8;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Scanner;

class Storehouse {
  HashMap<String, Integer> products_price = new HashMap<String, Integer>();
  HashMap<String, Integer> products_stock = new HashMap<String, Integer>();

  public void addProduct(String product, int price, int stock) {
    this.products_price.put(product, price);
    this.products_stock.put(product, stock);
  }

  public int price(String product) {
    if (this.products_price.containsKey(product)) {

      return products_price.get(product);
    } else {
      return -99;
    }
  }

  public int stock(String product) {
    if (this.products_stock.containsKey(product)) {
      return products_stock.get(product);

    } else {
      return 0;
    }
  }

  public boolean take(String product) {
    if (stock(product) == 0) {
      return false;
    } else {
      this.products_stock.replace(product, stock(product) - 1);
      return true;
    }
  }

  public Set<String> products() {
    return this.products_stock.keySet();
  }
}

class Purchase {
  String product;
  int amount;
  int unitPrice;

  public Purchase(String product, int amount, int unitPrice) {
    this.product = product;
    this.amount = amount;
    this.unitPrice = unitPrice;
  }

  public int price() {
    return unitPrice * amount;
  }

  public void increaseAmount() {
    amount += 1;
  }

  public String toString() {
    return this.product + ": " + this.amount;
  }
}

class ShoppingBasket {
  Map<String, Purchase> items;

  public ShoppingBasket() {
    this.items = new HashMap<String, Purchase>();
  }

  public void add(String product, int price) {
    if (items.containsKey(product)) {
      items.get(product).increaseAmount();
    } else {
      Purchase purchase = new Purchase(product, 1, price);
      this.items.put(product, purchase);
    }
  }

  public int price() {
    int temp = 0;
    for (Purchase product : items.values()) {
      temp += product.price();

    }
    return temp;
  }

  public void print() {
    for (Purchase product : items.values()) {
      System.out.println(product);
    }
  }
}

class Shop {

  private Storehouse store;
  private Scanner reader;

  public Shop(Storehouse store, Scanner reader) {
    this.store = store;
    this.reader = reader;
  }

  // the method to deal with a customer in the shop
  public void manage(String customer) {
    ShoppingBasket basket = new ShoppingBasket();
    System.out.println("Welcome to our shop " + customer);
    System.out.println("below is our sale offer:");

    for (String product : store.products()) {
      System.out.println(product);
    }

    while (true) {
      System.out.print("what do you want to buy (press enter to pay):");
      String product = reader.nextLine();
      if (product.isEmpty()) {
        break;
      }

      else {
        if (store.stock(product) != 0) {
          basket.add(product, store.price(product));
          store.take(product);
        }
        else{
          System.out.println(product + " out of stock!");
        }
      }
    }

    System.out.println("your purchases are:");
    basket.print();
    System.out.println("basket price: " + basket.price());
  }
}

public class Ex12 {
  public static void main(String[] args) {
    Storehouse store = new Storehouse();
    store.addProduct("coffee", 5, 10);
    store.addProduct("milk", 3, 20);
    store.addProduct("milkbutter", 2, 55);
    store.addProduct("bread", 7, 8);

    Shop shop = new Shop(store, new Scanner(System.in));
    shop.manage("Pekka");
  }
}
