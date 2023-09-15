package week5;

class BoundedCounter {
  private int value;
  private int upperLimit;

  public BoundedCounter(int upperLimit) {
    this.upperLimit = upperLimit;
  }

  public void next() {
    if (this.value == upperLimit) {
      this.value = 0;
    } else {
      value += 1;
    }
  }

  public String toString() {
    if (this.value < 10) {
      return "0" + Integer.toString(this.value);
    } else {
      return Integer.toString(this.value);
    }
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int setValue) {
    this.value = setValue;
  }
}

class Clock {
  private BoundedCounter hours;
  private BoundedCounter minutes;
  private BoundedCounter seconds;

  public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
    this.hours = new BoundedCounter(23);
    this.hours.setValue(hoursAtBeginning);
    this.minutes = new BoundedCounter(59);
    this.minutes.setValue(minutesAtBeginning);
    this.seconds = new BoundedCounter(59);
    this.seconds.setValue(secondsAtBeginning);
  }

  public void tick() {
    this.seconds.next();
    if (this.seconds.getValue() == 0) {
      this.minutes.next();
      if (minutes.getValue() == 0) {
        this.hours.next();
      }
    }
  }

  public String toString() {
    return this.hours.toString() + ":" + this.minutes.toString() + ":" + this.seconds.toString();
  }
}

public class Ex89 {
  public static void main(String[] args) {
    Clock clock = new Clock(23, 59, 50);

    int i = 0;
    while (i < 20) {
      System.out.println(clock);
      clock.tick();
      i++;
    }
  }
}
