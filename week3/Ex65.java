package week3;
import java.util.ArrayList;

public class Ex65 {
  public static ArrayList<Integer> lengths(ArrayList<String> list) {
    // write your code here
    ArrayList<Integer> lengths = new ArrayList<Integer>();
    for(String string: list){
      lengths.add(string.length());
    }
    return lengths;
  }

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Hallo");
    list.add("Moi");
    list.add("Benvenuto!");
    list.add("badger badger badger badger");
    ArrayList<Integer> lengths = lengths(list);

    System.out.println("The lengths of the Strings: " + lengths);
  }
}
