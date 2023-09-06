import java.util.Scanner;

public class Ex21 {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    try {
      System.out.println("Type a year: ");
      int num1 = reader.nextInt();
      boolean isLeapyear = (num1 % 4 == 0) && (!(num1 % 100 == 0) || (num1 % 400 == 0));
      if (isLeapyear) {
        System.out.println("The year is a leap year.");
      } else {
        System.out.println("The year is not a leap year.");

      }
    } catch (Exception e) {
      System.out.println("Error: not an integer!");
    }

  }

}
