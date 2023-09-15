package week5;

import java.util.ArrayList;

class Player {
  String name;
  int goals;

  Player(String name) {
    this.name = name;
    this.goals = 0;
  }

  Player(String name, int goals) {
    this.name = name;
    this.goals = goals;
  }

  String getName() {
    return this.name;
  }

  int goals() {
    return this.goals;
  }

  public String toString() {
    return this.name + ", goals " + this.goals;
  }
}

class Team {
  String name;
  ArrayList<Player> players = new ArrayList<Player>();
  int maxSize;

  Team(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int size(){
    return this.players.size();
  }

  public void addPlayer(Player player) {
    if(this.maxSize != 0 && this.maxSize <= players.size()){
      return;
    }
    players.add(player);
  }

  public void printPlayers() {
    for (Player player : this.players) {
      System.out.println(player);
    }
  }

  public void setMaxSize(int maxSize){
    this.maxSize = maxSize;
  }

  public int goals(){
    int temp_int = 0;
    for (Player player : this.players){
      temp_int += player.goals();
    }
    return temp_int;
  }
}

public class Ex90 {
    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Total goals: " + barcelona.goals());
    }
}
