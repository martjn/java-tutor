package week9.Ex20.Application;

public interface Sensor {
  boolean isOn();
  void on();
  void off();
  int measure();
}
