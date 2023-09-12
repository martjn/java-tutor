package week4;

import java.util.ArrayList;
import java.util.Random;

class LotteryNumbers {
  private ArrayList<Integer> numbers;

  public LotteryNumbers() {
    // We'll format a list for the numbers
    this.numbers = new ArrayList<Integer>();
    // Draw numbers as LotteryNumbers is created
    this.drawNumbers();
  }

  public ArrayList<Integer> numbers() {
    return this.numbers;
  }

  public void drawNumbers() {
    // Write the number drawing here using the method containsNumber()
    Random random = new Random();
    while(this.numbers.size() < 7){
      int newNum = random.nextInt((39 - 1) + 1) + 1;
      if(!containsNumber(newNum)){
        numbers.add(newNum);
      }

    }
  }

  public boolean containsNumber(int number) {
    // Test here if the number is already among the drawn numbers
    if(this.numbers.contains(number)){
      return true;
    }
    else{
      return false;
    }
  }
}

public class Ex82 {
  public static void main(String[] args) {
    LotteryNumbers lotteryNumbers = new LotteryNumbers();
    ArrayList<Integer> numbers = lotteryNumbers.numbers();

    System.out.println("Lottery numbers:");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
    System.out.println("");
  }
}
