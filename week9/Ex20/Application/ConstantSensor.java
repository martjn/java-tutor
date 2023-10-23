package week9.Ex20.Application;

import week9.Ex20.Application.Sensor;

public class ConstantSensor implements Sensor {
  int reading;
  boolean online;

  public ConstantSensor(int _reading) {
    this.reading = _reading;
    this.online = true;
  }

  public boolean isOn() {
    return this.online;
  }

  public void on() {
    this.online = true;
  }

  public void off() {
    this.online = true;
  }

  public int measure(){
    if(this.online){
      return this.reading;
    }
    else{
      throw new IllegalStateException("The sensor must be turned on to read value");
    }

  }

}
