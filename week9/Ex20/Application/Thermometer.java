package week9.Ex20.Application;
import week9.Ex20.Application.Sensor;

public class Thermometer implements Sensor{
  boolean online;
  public Thermometer(){
    this.online = false;
  }

  public boolean isOn(){
    return this.online;
  }

  public void off(){
    this.online = false;
  }
  public void on(){
    this.online = true;
  }

  public int measure() {
    if(this.online){
      return (int) (Math.random() * 61) - 30;
    }
    else{
      throw new IllegalStateException("The thermometer must be turned on to read values");
    }
  }
}
