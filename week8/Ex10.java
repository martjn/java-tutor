package week8;

interface NationalService {
  int getDaysLeft();

  void work();
}

class CivilService implements NationalService {
  int days;

  public CivilService() {
    this.days = 362;
  }

  public int getDaysLeft() {
    return this.days;
  }

  public void work() {
    if (this.days == 0) {
      this.days--;
    }
  }
}

class MilitaryService implements NationalService {
  int days;

  public MilitaryService(int daysLeft) {
    this.days = daysLeft;
  }

  public int getDaysLeft() {
    return this.days;
  }

  public void work() {
    if (this.days == 0) {
      this.days--;
    }
  }
}

public class Ex10 {

}
