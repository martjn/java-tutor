package week4;

import java.util.ArrayList;

class Menu {
  private ArrayList<String> meals;

  public Menu() {
    this.meals = new ArrayList<String>();
  }
  public void addMeal(String mealName){
    this.meals.add(mealName);
  }
  public void printMenu(){
    System.out.println(this.meals);
  }
  public void clearMenu(){
    meals.clear();
  }
}
public class Ex76 {
  public static void main(String[] args) {
    Menu menu = new Menu();
    menu.addMeal("potatos");
    menu.addMeal("potatos2");
    menu.printMenu();
    menu.clearMenu();
    menu.printMenu();
  }

}
