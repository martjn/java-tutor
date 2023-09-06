import java.util.Scanner;

public class MaxNum {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
  
    try{
      System.out.println("Type a number: ");
      int num1 = reader.nextInt();
      System.out.println("Type another number: ");
      int num2 = reader.nextInt();
      int max = Math.max(num1, num2);
      System.out.println("The bigger number of the two numbers given was: " + max);
  
    }
    catch(Exception e){
      System.out.println("Error: not an integer!");
    }

  }

}
