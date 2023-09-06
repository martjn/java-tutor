import java.util.Scanner;

public class Adder {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
  
    try{
      System.out.println("Type a number: ");
      int num1 = reader.nextInt();
      System.out.println("Type another number: ");
      int num2 = reader.nextInt();
      int sum = num1 + num2;
      System.out.println("Sum of the numbers: " + sum);
  
    }
    catch(Exception e){
      System.out.println("Error: not an integer!");
    }

  }

}
