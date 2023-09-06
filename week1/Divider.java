import java.util.Scanner;

public class Divider {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
  
    try{
      System.out.println("Type a number: ");
      float num1 = reader.nextInt();
      System.out.println("Type another number: ");
      float num2 = reader.nextInt();
      float sum = num1 / num2;
      System.out.println("Division: " + num1 + " / " + num2 + " = " + sum);
  
    }
    catch(Exception e){
      System.out.println("Error: not a float or integer!");
    }

  }

}

