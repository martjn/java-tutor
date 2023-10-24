package week10.Ex31.farmsimulator;

import java.util.ArrayList;

public class Farm implements Alive {
  String owner;
  Barn barn;
  ArrayList<Cow> cows;
  MilkingRobot robot;

  public Farm(String _owner, Barn _barn){
    this.owner = _owner;
    this.barn = _barn;
    this.cows = new ArrayList<Cow>();
  }

  public void liveHour(){
    for(Cow cow : cows){
      cow.liveHour();
    }
  }
  public void manageCows(){
    for(Cow cow : cows){
      this.barn.takeCareOf(cow);
    }
  }

  public String getOwner(){
    return this.owner;
  }

  public void addCow(Cow cow){
    this.cows.add(cow);
  }

  public void installMilkingRobot(MilkingRobot robot){
    this.barn.installMilkingRobot(robot);
  }

  public String toString(){
    String temp = "";
    temp += "Farm owner: " + this.owner + "\n";
    temp += "Barn bulk tank: " + this.barn.getBulkTank().getVolume() + "/" + this.barn.getBulkTank().getCapacity() + "\n";
    if(cows.size() != 0){
      temp += "Animals:\n";
      for(Cow cow: cows){
        temp += "\t" + cow.getName() + " " + cow.getAmount() + "/" + cow.getCapacity() + "\n";
      }
    }
    else{
      temp += "No cows.";
    }
    return temp;
  }

}
