package week6;

import java.util.Random;

class NightSky {
  private double density;
  private int width;
  private int height;
  private int starsInLastPrint;

  public NightSky(double density) {
    this.density = density;
  }

  public NightSky(int width, int height) {
    this.density = 0.1;
    this.width = width;
    this.height = height;
  }

  public NightSky(double density, int width, int height) {
    this.density = density;
    this.width = width;
    this.height = height;
  }

  public void printLine() {
    Random random = new Random();
    double odds = this.density * 100;

    for (int i = 0; i < this.width; i++) {
      int nextInt = random.nextInt(100);
      if (nextInt < odds) {
        System.out.print("*");
        this.starsInLastPrint += 1;
      } else {
        System.out.print(" ");
      }
    }
    System.out.println();
  }

  public void print() {
    this.starsInLastPrint = 0;
    for (int i = 0; i < this.height; i++) {
      printLine();
    }
  }

  public int starsInLastPrint() {
    return this.starsInLastPrint;
  }

}

public class Ex100 {
  public static void main(String[] args) {
    NightSky NightSky = new NightSky(8, 4);
    NightSky.print();
    System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    System.out.println("");

    NightSky.print();
    System.out.println("Number of stars: " + NightSky.starsInLastPrint());
  }
}
