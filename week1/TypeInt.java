import java.util.Scanner;

public class TypeInt {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Type an integer: ");
    try {
      //int number = Integer.parseInt(reader.nextLine());
      int number = reader.nextInt();
      System.out.println("You typed " + number);
    } catch (Exception e) {
      System.out.println("Error: Not an integer!");
    }

  }
}
