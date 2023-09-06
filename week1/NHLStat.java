import java.util.Scanner;

public class NHLStat {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
  
    try{
      System.out.println("Type the radius: ");
      double ans = 2 * Math.PI * reader.nextDouble();
      System.out.println("Circum of circle: " + ans);
  
    }
    catch(Exception e){
      System.out.println("Error: something went wrong!");
    }

  }

}

