package week4;

import java.util.ArrayList;

public class Ex71 {

  public static void smartCombineArrays(ArrayList<Integer> first, ArrayList<Integer> second) {
    for (int i = 0; i < second.size(); i++) {
      if (!first.contains(second.get(i))) {
        first.add(second.get(i));

      }
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> first = new ArrayList<Integer>();
    ArrayList<Integer> second = new ArrayList<Integer>();
    first.add(1);
    first.add(2);
    second.add(3);
    second.add(3);
    second.add(4);
    second.add(4);
    System.out.println("first before: " + first);
    smartCombineArrays(first, second);
    System.out.println("first after: " + first);
  }
}
