package week7;

import java.util.ArrayList;

class Thing {
  String name;
  int weight;

  public Thing(String _name, int _weight) {
    this.name = _name;
    this.weight = _weight;
  }

  public String getName() {
    return this.name;
  }

  public int getWeight() {
    return this.weight;
  }

  public String toString() {
    return this.name + " (weight " + this.weight + " kg)";
  }
}

class Suitcase {
  ArrayList<Thing> things;
  int weightLimit;

  public Suitcase(int _weightLimit) {
    this.weightLimit = _weightLimit;
    this.things = new ArrayList<Thing>();
  }

  public void addThing(Thing _thing) {
    int totalWeight = 0;
    for (Thing thing : things) {
      totalWeight += thing.getWeight();
    }
    if (totalWeight + _thing.getWeight() > this.weightLimit) {
      ;
    } else {
      this.things.add(_thing);

    }
  }

  public String toString() {
    int amountOfThings = this.things.size();
    int weightOfThings = 0;
    for (Thing thing : things) {
      weightOfThings += thing.getWeight();
    }
    String val = "";
    if (amountOfThings == 0) {
      val = "empty (0 kg)";
    } else if (amountOfThings == 1) {
      val = amountOfThings + " thing (" + weightOfThings + " kg)";
    } else {
      val = amountOfThings + " things (" + weightOfThings + " kg)";
    }
    return val;
  }

  public void printThings() {
    for (Thing thing : things) {
      System.out.println(thing);
    }
  }

  public int totalWeight() {
    int temp = 0;
    for (Thing thing : things) {
      temp += thing.getWeight();
    }
    return temp;
  }

  public Thing heaviestThing() {
    Thing temp_thing = new Thing("temp", 0);
    for (Thing thing : things) {
      if (temp_thing.getWeight() < thing.getWeight()) {
        temp_thing = thing;
      }
    }
    return temp_thing;
  }
}

class Container {
  int weightLimit;
  ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();

  public Container(int _weightLimit) {
    this.weightLimit = _weightLimit;
  }

  public void addSuitcase(Suitcase _suitcase) {
    int temp_weight = 0;
    for (Suitcase suitcase : this.suitcases) {
      temp_weight += suitcase.totalWeight();
    }
    if (temp_weight + _suitcase.totalWeight() <= weightLimit) {
      this.suitcases.add(_suitcase);
    }
  }

  public void printThings() {
    for (Suitcase suitcase : this.suitcases) {
      suitcase.printThings();
    }
  }

  public String toString() {
    int temp_weight = 0;
    for (Suitcase suitcase : suitcases) {
      temp_weight += suitcase.totalWeight();
    }
    return suitcases.size() + " suitcases (" + temp_weight + " kg)";
  }
}

public class Ex4 {

  public static void addSuitcasesFullOfBricks(Container container) {
    for (int i = 0; i < 100; i++) {
      Thing brick = new Thing("Brick", 1 + i);
      Suitcase suitcase = new Suitcase(100);
      suitcase.addThing(brick);
      container.addSuitcase(suitcase);
    }
  }

  public static void main(String[] args) {
    Container container = new Container(1000);
    addSuitcasesFullOfBricks(container);
    System.out.println(container);
  }
}
