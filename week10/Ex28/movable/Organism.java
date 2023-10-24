package week10.Ex28.movable;

public class Organism implements Movable {
  int x;
  int y;
  public Organism(int x, int y){
    this.x = x;
    this.y = y;
  }

  public String toString(){
    return "x: " + this.x + "; y: " + this.y;
  }
  public void move(int dx, int dy){
    this.x += dx;
    this.y += dy;
  }
}
