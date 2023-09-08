package week3;

import java.util.ArrayList;

public class Ex67 {

  public static double calculateVariance(ArrayList<Integer> list) {
    // write your code here
    double sum = 0;
    double avg = 0;
    for(Integer num : list){
      sum += num;
    }
    avg = sum / list.size();
    double variance = 0;
    for(Integer num: list){
      variance += Math.pow((num - avg),2);
    }
    variance /= list.size() - 1;
    return variance;

  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The variance is: " + calculateVariance(list));
  }
}
