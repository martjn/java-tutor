package week2;

import java.util.Scanner;

public class Ex41 {
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    int min = 0;
    int max = 100;
    int drawNumber = drawNumber(min, max);
    int guesses = 0;
    while (true) {
      System.out.print("Guess a number: ");
      int guess = reader.nextInt();
      if (guess != drawNumber) {
        ++guesses;
        if (guess < drawNumber) {
          System.out.println("The number is greater, guesses made: " + guesses);
        } else {
          System.out.println("The number is lesser, guesses made: " + guesses);
        }
      } else {
        System.out.println("Congratulations, your guess is correct!");
        break;

      }
    }
  }

  public static int drawNumber(int min, int max) {
    return (int) Math.floor(Math.random() * (max - min + 1) + min);
  }
}
