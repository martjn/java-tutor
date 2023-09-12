package week4;

import java.util.Scanner;

class BoundedCounter {
  private int value;
  private int upperLimit;

  public BoundedCounter(int upperLimit) {
    this.upperLimit = upperLimit;
  }

  public void next() {
    if (this.value == upperLimit) {
      this.value = 0;
    } else {
      value += 1;
    }
  }

  public String toString() {
    if (this.value < 10) {
      return "0" + Integer.toString(this.value);
    } else {
      return Integer.toString(this.value);
    }
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int setValue) {
    this.value = setValue;
  }
}

public class Ex78 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    BoundedCounter seconds = new BoundedCounter(59);
    BoundedCounter minutes = new BoundedCounter(59);
    BoundedCounter hours = new BoundedCounter(23);

    System.out.print("seconds: ");
    int s = reader.nextInt();
    System.out.print("minutes: ");
    int m = reader.nextInt();
    System.out.print("hours: ");
    int h = reader.nextInt();

    seconds.setValue(s);
    minutes.setValue(m);
    hours.setValue(h);

    int i = 0;
    while (i < 1210) {
      // like in previous but seconds taken into account
      seconds.next();
      if(seconds.getValue() == 59){
        minutes.next();
        if(minutes.getValue() == 59){
          hours.next();
        }
      }
      System.out.println(hours + ":" + minutes + ":" + seconds);
      i++;
    }

  }

}