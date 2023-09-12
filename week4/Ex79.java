package week4;
import java.util.Scanner;

class NumberStatistics {
  private int amountOfNumbers;
  private int sum;
  private int oddSum;
  private int evenSum;

  public NumberStatistics() {
    this.amountOfNumbers = 0;
  }

  public void addNumber(int number) {
    this.amountOfNumbers++;
    this.sum += number;
    if(number % 2 == 0){
      this.evenSum += number;
    }
    else{
      this.oddSum += number;
    }
  }

  public int amountOfNumbers() {
    return this.amountOfNumbers;
  }

  public int sum() {
    return this.sum;
  }
  public int evenSum() {
    return this.evenSum;
  }
  public int oddSum() {
    return this.oddSum;
  }

  public double average() {
    return (double) sum / (double) amountOfNumbers;
  }
}

public class Ex79 {
  public static void main(String[] args) {
    NumberStatistics stats = new NumberStatistics();
    Scanner reader = new Scanner(System.in);

    int tracker;
    System.out.println("Type numbers: ");
    while(true){
      tracker = reader.nextInt();
      if(tracker == -1){
        break;
      }
      else{
        stats.addNumber(tracker);
      }
    }
    System.out.println("Sum: " + stats.sum());
    System.out.println("even Sum: " + stats.evenSum());
    System.out.println("odd Sum: " + stats.oddSum());
}
}
