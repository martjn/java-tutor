package week10.Ex29.people;

public class Teacher extends Person {
  int salary;
  public Teacher(String name, String address, int salary){
    super(name, address);
    this.salary = salary;
  }
  public String toString(){
    return this.name + "\n  " + this.address + "\n  salary " + this.salary + " euros/month";
  }
}
