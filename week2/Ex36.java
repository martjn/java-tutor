package week2;

import java.util.Scanner;

public class Ex36 {
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    int count = 0;
    int sum = 0;
    int evens = 0;
    int odds = 0;
    while (true) {
      System.out.print("Type numbers: ");
      int new_num = reader.nextInt();
      if (new_num != -1) {
        count++;
        sum += new_num;
        if (new_num % 2 == 0) {
          evens++;
        } else {
          odds++;
        }
      } else {
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + (double) sum / count);
        System.out.println("Even numbers: " + evens);
        break;
        System.out.println("Odd numbers: " + odds);

      }

    }

  }
}
