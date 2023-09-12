package week4;
import java.util.ArrayList;

public class Ex70 {

  public static void combineArrays(ArrayList<Integer> first, ArrayList<Integer> second){
    for(int i = 0; i < second.size(); i++){
      first.add(second.get(i));
    }
  }
  public static void main(String[] args){
    ArrayList<Integer> first = new ArrayList<Integer>();
    ArrayList<Integer> second = new ArrayList<Integer>();
    first.add(1);
    first.add(1);
    first.add(1);
    first.add(1);
    second.add(2);
    second.add(2);
    second.add(2);
    second.add(2);
    System.out.println("first before: " + first);
    combineArrays(first, second);
    System.out.println("first after: " + first);
  }
}
