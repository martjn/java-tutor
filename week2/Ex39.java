package week2;

public class Ex39 {
  public static void main(String[] args){
    printRectangle(17, 3);
    printLeftAlignedTriangle(7);
  }
  public static void printStars(int amount){
    String stars = "*".repeat(amount);
    System.out.println(stars);
  }
  public static void printSquare(int sideLength){
    for(int i = 0; i < sideLength; i++){
      printStars(sideLength);
    }
  }
  public static void printRectangle(int width, int height){
    for(int i = 0; i < height; i++){
      System.out.println("*".repeat(width));
    }
  }
  public static void printLeftAlignedTriangle(int size){
    for(int i = 1; i <= size; i++){
      System.out.println("*".repeat(i));
    }
  }
}
