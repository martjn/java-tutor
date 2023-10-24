package week10.Ex31.farmsimulator;

public class BulkTank {
  double capacity;
  double volume;
  public BulkTank(){
    this.capacity = 2000;
    this.volume = 0;
  }
  public BulkTank(double capacity){
    this.capacity = capacity;
    this.volume = 0;
  }
  public double getCapacity(){
    return this.capacity;
  }
  public double getVolume(){
    return this.volume;
  }
  public double howMuchFreeSpace(){
    return this.capacity - this.volume;
  }
  public void addToTank(double amount){
    double temp = this.volume + amount;
    if(temp > capacity){
      this.volume = capacity;
    }
    else{
      this.volume = temp;
    }
  }
  public double getFromTank(double amount){
    if(amount > this.volume){
      this.volume = 0;
      return this.volume;
    }
    else{
      this.volume -= amount;
      return amount;
    }
  }
  public String toString(){
    return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
  }
}
