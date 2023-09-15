package week5;

class Counter {
  int value;
  boolean check;

  public Counter(int startingValue, boolean check){
    this.value = startingValue;
    this.check = check;
  }

  public Counter(int startingValue){
    this.value = startingValue;
    this.check = false;
  }

  public Counter(boolean check){
    this.value = 0;
    this.check = check;
  }
  public Counter(){
    this.value = 0;
    this.check = false;
  }

  public int value(){
    return this.value;
  }
  public void increase(){
    this.value++;
  }
  public void decrease(){
    if(this.check && this.value == 0){
      System.out.println("Can\'t go below 0");
    }
    else{
      this.value--;
    }
  }
}

public class Ex84 {
  
}
