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
    while(true){
      if(calc - 360 < 0){
        break;
      }
      else{
        calc -= 360;
        count++;
      }
    }
    return count;
  }
}

public class Ex92 {
  public static void main(String[] args) {
    MyDate first = new MyDate(24, 12, 2009);
    MyDate second = new MyDate(1, 1, 2011);
    MyDate third = new MyDate(25, 12, 2010);

    System.out.println( first + " and " + second + " difference in years: " + second.differenceInYears(first) );
    System.out.println( second + " and " + first + " difference in years: " + first.differenceInYears(second) );
    System.out.println( first + " and " + third + " difference in years: " + third.differenceInYears(first) );
    System.out.println( third + " and " + first + " difference in years: " + first.differenceInYears(third) );
    System.out.println( third + " and " + second + " difference in years: " + second.differenceInYears(third) );
    System.out.println( second + " and " + third + " difference in years: " + third.differenceInYears(second) );
}
}
