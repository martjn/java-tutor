package week3;
import java.util.ArrayList;

public class Ex64 {

  public static double average(ArrayList<Integer> list){
    double sum = 0;
    for(Integer num : list){
      sum += num;
    }
    return sum / list.size();
  }

  public static void main(String[] arg) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The average is: " + average(list));
  }

}
