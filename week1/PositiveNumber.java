import java.util.Scanner;

public class PositiveNumber {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    try {
      System.out.println("Type a number: ");
      int num1 = reader.nextInt();
      boolean isPositive = num1 >= 0;
      if (isPositive) {
        System.out.println("The number is positive.");
      } else {
        System.out.println("The number is not positive.");
      }

    } catch (Exception e) {
      System.out.println("Error: not an integer!");
    }

  }

}
