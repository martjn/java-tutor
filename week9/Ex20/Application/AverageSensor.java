package week9.Ex20.Application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
  boolean online;
  ArrayList<Sensor> sensors;
  ArrayList<Integer> measurements;

  public AverageSensor() {
    this.online = false;
    this.sensors = new ArrayList<Sensor>();
    this.measurements = new ArrayList<Integer>();
  }

  public boolean isOn() {
    // if all sensors in sensors array are online, return true
    // otherwise, return false
    for (Sensor sensor : sensors) {
      if (!sensor.isOn()) {
        return false;
      }
    }
    return true;
  }

  public void on() {
    for (Sensor sensor : sensors) {
      sensor.on();
    }
  }

  public void off() {
    for (Sensor sensor : sensors) {
      sensor.off();
    }
  }

  public int measure() {
    if (!isOn()) {
      throw new IllegalStateException("The AverageSensor must be turned on to read values");
    }
    int temp = 0;
    for(Sensor sensor: sensors){
      temp += sensor.measure();
    }
    int measurement = (int) temp / sensors.size();
    this.measurements.add(measurement);
    return measurement;
  }

  public void addSensor(Sensor sensor) {
    this.sensors.add(sensor);
  }

  public List<Integer> readings() {
    return this.measurements;

  }

}
