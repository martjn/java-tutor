package week9.Ex18.moving.logic;

import java.util.List;

import week10.Ex32.boxes.Thing;

import java.util.ArrayList;
import week9.Ex18.moving.domain.Box;

public class Packer {
  int boxesVolume;

  public Packer(int boxesVolume) {
    this.boxesVolume = boxesVolume;
  }

  public List<Box> packThings(List<Thing> things) {
    ArrayList<Box> temp_list = new ArrayList<Box>();
    Box temp_box = new Box(this.boxesVolume);
    for (Thing thing : things) {
      int totalVolume = temp_box.getVolume() + thing.getVolume();
      if (totalVolume > this.boxesVolume) {
        temp_list.add(temp_box);
        temp_box = new Box(this.boxesVolume);
        temp_box.addThing(thing);
      } else if (totalVolume <= this.boxesVolume) {
        temp_box.addThing(thing);
      }
    }
    if(!temp_list.contains(temp_box)){
      temp_list.add(temp_box);
    }
    System.out.println(temp_box);
    return temp_list;

  }
}
