package week8;

import java.util.ArrayList;

interface ToBeStored {
  double weight();
}

class Book implements ToBeStored {
  String writer;
  String name;
  double weight;

  public Book(String _writer, String _name, double _weight) {
    this.writer = _writer;
    this.name = _name;
    this.weight = _weight;
  }

  public double weight() {
    return this.weight;
  }

  public String toString() {
    return this.writer + ": " + this.name;
  }
}

class CD implements ToBeStored {
  String artist;
  String title;
  int year;
  double weight = 0.1;

  public CD(String _artist, String _title, int _year) {
    this.artist = _artist;
    this.title = _title;
    this.year = _year;
  }

  public double weight() {
    return this.weight;
  }

  public String toString() {
    return this.artist + ": " + this.title + " (" + this.year + ")";
  }
}

class Box implements ToBeStored {
  double maxWeight;
  ArrayList<ToBeStored> things;

  public Box(double _maxWeight) {
    this.maxWeight = _maxWeight;
    this.things = new ArrayList<ToBeStored>();
  }

  public double weight() {
    double temp = 0;
    for (ToBeStored thing : things) {
      temp += thing.weight();
    }
    return temp;
  }

  public void add(ToBeStored thing) {
    if (this.maxWeight > thing.weight() + weight()) {
      things.add(thing);
    }
  }

  public String toString() {
    return "Box: " + this.things.size() + " things, total weight: " + weight() + " kg";
  }

}

public class Ex11 {
  public static void main(String[] args) {
    Box box = new Box(10);
    Box box2 = new Box(100);
    Box small_box = new Box(5);

    box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
    box.add(new Book("Robert Martin", "Clean Code", 1));
    box.add(new Book("Kent Beck", "Test Driven Development", 0.7));
    small_box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

    box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
    box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
    box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
    box.add(small_box);
    box2.add(box2);
    System.out.println(box2);
  }
}
