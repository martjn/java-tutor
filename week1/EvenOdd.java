import java.util.Scanner;

public class EvenOdd {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    try {
      System.out.println("Type a number: ");
      int num1 = reader.nextInt();
      boolean isEven = num1 % 2 == 0;
      if (isEven) {
        System.out.println("The number is even.");
      } else {
        System.out.println("The number is odd.");
      }

    } catch (Exception e) {
      System.out.println("Error: not an integer!");
    }

  }

}
