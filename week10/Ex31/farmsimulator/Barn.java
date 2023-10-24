package week10.Ex31.farmsimulator;

import java.util.Collection;

public class Barn {
  BulkTank barnTank;
  MilkingRobot robot;

  public Barn(BulkTank tank) {
    this.barnTank = tank;
  }

  public BulkTank getBulkTank() {
    return this.barnTank;
  }

  public void installMilkingRobot(MilkingRobot milkingRobot) {
    this.robot = milkingRobot;
    this.robot.setBulkTank(barnTank);
  }

  public void takeCareOf(Cow cow) {
    if (robot == null) {
      throw new IllegalStateException("Milking robot hasn't been installed in the Barn");
    } else {
      this.robot.milk(cow);
    }
  }

  public void takeCareOf(Collection<Cow> cows) {
    if (this.robot == null) {
      throw new IllegalStateException("Milking robot hasn't been installed in the Barn");
    } else {

      for (Cow cow : cows) {
        this.robot.milk(cow);
      }
    }
  }
  public String toString(){
    return "Barn: " + this.barnTank.getVolume() + "/" + this.barnTank.getCapacity();
  }
}
