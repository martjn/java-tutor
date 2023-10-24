package week10.Ex31.farmsimulator;

import java.lang.IllegalStateException;

public class MilkingRobot {
  BulkTank connectedTank;

  public MilkingRobot() {
    this.connectedTank = new BulkTank();
  }

  public BulkTank getBulkTank() {
    return (connectedTank != null) ? this.connectedTank : null;
  }

  public void setBulkTank(BulkTank tank) {
    this.connectedTank = tank;
  }

  public void milk(Milkable milkable) {
    if (this.connectedTank == null) {
      throw new IllegalStateException("The Milking robot has not been installed");
    } else {

      this.connectedTank.addToTank(milkable.milk());
    }
  }

}
