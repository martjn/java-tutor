import java.util.Scanner;

public class Grades {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    try {
      System.out.println("Type the points [0-60]: ");
      int num = reader.nextInt();
      if (num <= 29) {
        System.out.println("Grade: Failed");
      } else if (num >= 30 && num <= 34) {
        System.out.println("Grade: 1");

      } else if (num >= 35 && num <= 39) {
        System.out.println("Grade: 2");

      } else if (num >= 40 && num <= 44) {
        System.out.println("Grade: 3");

      } else if (num >= 45 && num <= 49) {
        System.out.println("Grade: 4");

      } else if (num >= 50 && num <= 60) {
        System.out.println("Grade: 5");

      }

    } catch (Exception e) {
      System.out.println("Error: not an integer!");
    }

  }

}
