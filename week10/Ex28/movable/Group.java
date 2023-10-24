package week10.Ex28.movable;
import java.util.ArrayList;

public class Group implements Movable {
  ArrayList<Movable> objects = new ArrayList<Movable>();
  public String toString(){
    String temp_string = "";
    for(Movable movable : this.objects){
      temp_string += movable.toString() + "\n";
    }
    return temp_string;
  }

  public void addToGroup(Movable movable){
    this.objects.add(movable);
  }

  public void move(int dx, int dy){
    for(Movable movable : this.objects){
      movable.move(dx, dy);
    }
  }

}
