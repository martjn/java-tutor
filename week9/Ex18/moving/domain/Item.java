package week9.Ex18.moving.domain;

public class Item implements Thing, Comparable<Item> {
  String name;
  int volume;

  public Item(String _name, int _volume){
    this.name = _name;
    this.volume = _volume;
  }

  public String getName() {
    return this.name;
  }

  public int getVolume(){
    return this.volume;
  }

  public String toString(){
    return this.name + " (" + this.volume + " dm^3)";
  }

  @Override
  public int compareTo(Item comparable){
    if(this.volume > comparable.getVolume()){
      return 1;
    }
    else if (this.volume == comparable.getVolume()){
      return 0;
    }
    else{
      return -1;
    }
  }
}