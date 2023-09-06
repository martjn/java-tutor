package week2;

import java.util.Scanner;

public class Ex35 {
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    System.out.print("Type a number: ");
    int num = reader.nextInt();
    int sum = 0;

    for (int i = 0; i <= num; i++) {
      sum += Math.pow(2, i);
    }

    System.out.println("Result is " + sum);
  }
}
