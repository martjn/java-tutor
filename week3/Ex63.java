package week3;
import java.util.ArrayList;

public class Ex63 {

  public static int sum(ArrayList<Integer> list){
    int sum = 0;
    for(Integer num : list){
      sum += num;
    }
    return sum;
  }

  public static void main(String[] arg) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The sum: " + sum(list));

    list.add(10);

    System.out.println("the sum: " + sum(list));
  }

}
