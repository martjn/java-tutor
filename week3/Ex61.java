package week3;

import java.util.ArrayList;

public class Ex61 {

  public static int countItems(ArrayList<String> items) {
    int counter = 0;
    for (String string : items) {
      counter++;
    }
    return counter;
  }

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Hallo");
    list.add("Ciao");
    list.add("Ciao2");
    list.add("Ciao3");

    System.out.println("There are this many items in the list:");
    System.out.println(countItems(list));
  }
}
