package week3;

import java.util.Scanner;

public class Ex53 {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Type a word: ");
    String word = reader.nextLine();
    System.out.println("Length of the first part: ");
    int wordPart = reader.nextInt();
    System.out.print("Result: ");
    System.out.print(word.substring(0, wordPart));
  }
}
