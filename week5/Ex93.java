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

  public int getMonth() {
    return this.month;
  }

  public int getDay() {
    return this.day;
  }

  public String toString() {
    return this.day + "." + this.month + "." + this.year;
  }

  public int getTotalDays() {
    int temp_months = 0;
    // get months from years
    for (int i = 0; i < this.year; i++) {
      for (int j = 0; j < 12; j++) {
        temp_months += 1;
      }
    }
    // get days from months
    int temp_days = 0;
    for (int i = 0; i < temp_months; i++) {
      for (int j = 0; j < 30; j++) {
        temp_days += 1;
      }
    }

    return temp_days + this.day;
  }

  public int differenceInYears(MyDate compareDate) {
    int calc = Math.abs(getTotalDays() - compareDate.getTotalDays());
    int count = 0;
    while (true) {
      if (calc - 360 < 0) {
        break;
      } else {
        calc -= 360;
        count++;
      }
    }
    return count;
  }
}

class Person {
  private String name;
  private MyDate birthday;

  public Person(String name, int pp, int kk, int vv) {
    this.name = name;
    this.birthday = new MyDate(pp, kk, vv);
  }

  public Person(String name, MyDate birthday) {
    this.name = name;
    this.birthday = new MyDate(birthday.getDay(), birthday.getMonth(), birthday.getYear());

  }

  public Person(String name) {
    this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DAY_OF_MONTH),
        Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
  }

  public int age() {
    // calculate the age based on the birthday and the current day
    // you get the current day as follows:
    MyDate today_date = new MyDate(Calendar.getInstance().get(Calendar.DAY_OF_MONTH),
        Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
    return birthday.differenceInYears(today_date);
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return this.name + ", born " + this.birthday;
  }

  public boolean olderThan(Person compared) {
    int temp1 = this.birthday.getTotalDays();
    int temp2 = compared.birthday.getTotalDays();
    return temp1 > temp2;
  }
}

public class Ex93 {
  public static void main(String[] args) {
    Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
    Person steve = new Person("Steve");

    System.out.println(pekka);
    System.out.println(steve);
  }
}
