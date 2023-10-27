package week9.Ex18.moving.domain;

import java.util.ArrayList;

import week10.Ex32.boxes.Thing;

public class Box implements Thing {
  int maximumCapacity;
  ArrayList<Thing> things;

  public Box(int maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
    this.things = new ArrayList<Thing>();
  }

  public int getVolume() {
    int temp_volume = 0;
    for (Thing thing : things) {
      temp_volume += thing.getVolume();
    }
    return temp_volume;
  }

  public boolean addThing(Thing thing) {
    if (getVolume() + thing.getVolume() > this.maximumCapacity) {
      return false;
    } else {
      things.add(thing);
      return true;
    }
  }

  public String toString(){
    return "things in the box: " + getVolume() + " dm^3";
  }
}
