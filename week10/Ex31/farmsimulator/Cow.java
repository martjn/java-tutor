package week10.Ex31.farmsimulator;

import java.util.Random;
import java.text.DecimalFormat;

public class Cow implements Milkable, Alive {

  private static final String[] NAMES = new String[] {
      "Anu", "Arpa", "Essi", "Heluna", "Hely",
      "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
      "Jaana", "Jami", "Jatta", "Laku", "Liekki",
      "Mainikki", "Mella", "Mimmi", "Naatti",
      "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
      "Rima", "Soma", "Sylkki", "Valpu", "Virpi" };
  String name;
  int udders;
  double milk;

  public Cow() {
    this.name = NAMES[0 + new Random().nextInt(NAMES.length)];
    this.udders = 15 + new Random().nextInt(40);
    this.milk = 0;
  }

  public Cow(String name) {
    this.name = name;
    this.udders = 15 + new Random().nextInt(40);
    this.milk = 0;
  }

  public String getName() {
    return this.name;
  }

  public double getCapacity() {
    return this.udders;
  }

  public double getAmount() {
    return this.milk;
  }

  public String toString() {
    return this.name + " " + this.milk + "/" + this.udders;
  }

  public double milk() {
    double temp = this.milk;
    this.milk = 0;
    return temp;
  }

  public void liveHour() {
    double increase = 0.7 + (1.3 * new Random().nextDouble());

    // Round to one decimal place.
    increase = Math.round(increase * 10.0) / 10.0;

    this.milk += increase;
  }

}
