package week5;

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

public class Ex92 {
    public static void main(String[] args) {
        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println( second + " and " + first + " difference in years: " + second.diffInYears(first) );

        System.out.println( third + " and " + first + " difference in years: " + third.diffInYears(first) );

        System.out.println( second + " and " + third + " difference in years: " + second.diffInYears(third) );
    }
}
