package week10.Ex29.people;

public class Person {
  String name;
  String address;
  public Person(String _name, String _address){
    this.name = _name;
    this.address = _address;
  }
  public String toString(){
    return this.name + "\n\t" + this.address;
  }
}
