package week10.Ex31;

import java.util.LinkedList;

import week10.Ex31.farmsimulator.Alive;
import week10.Ex31.farmsimulator.Barn;
import week10.Ex31.farmsimulator.BulkTank;
import week10.Ex31.farmsimulator.Cow;
import week10.Ex31.farmsimulator.Farm;
import week10.Ex31.farmsimulator.Milkable;
import week10.Ex31.farmsimulator.MilkingRobot;

public class Main {
  public static void main(String[] args) {
    Farm farm = new Farm("Esko", new Barn(new BulkTank()));
    MilkingRobot robot = new MilkingRobot();
    farm.installMilkingRobot(robot);

    farm.addCow(new Cow());
    farm.addCow(new Cow());
    farm.addCow(new Cow());

    farm.liveHour();
    farm.liveHour();

    farm.manageCows();

    System.out.println(farm);
  }
}
