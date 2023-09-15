package week5;

import java.util.Calendar;

class MyDate {
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getYear() {
    return this.year;
  }

  public String toString() {
    return this.day + "." + this.month + "." + this.year;
  }

  public int diffInYears(MyDate compareDate) {
    return Math.abs((this.year) - (compareDate.getYear()));
  }
}

class Person {
  private String name;
  private MyDate birthday;

  public Person(String name, int pp, int kk, int vv) {
    this.name = name;
    this.birthday = new MyDate(pp, kk, vv);
  }

  public int age() {
    Calendar.getInstance().get(Calendar.DATE);
    // calculate the age based on the birthday and the current day
    // you get the current day as follows:
    // Calendar.getInstance().get(Calendar.DATE);
    // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
    // Calendar.getInstance().get(Calendar.YEAR);
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return this.name + ", born " + this.birthday;
  }
}

public class Ex93 {
  public static void main(String[] args) {
    MyDate first = new MyDate(24, 12, 2009);
    MyDate second = new MyDate(1, 1, 2011);
    MyDate third = new MyDate(25, 12, 2010);

    System.out.println(second + " and " + first + " difference in years: " + second.diffInYears(first));

    System.out.println(third + " and " + first + " difference in years: " + third.diffInYears(first));

    System.out.println(second + " and " + third + " difference in years: " + second.diffInYears(third));
  }
}
