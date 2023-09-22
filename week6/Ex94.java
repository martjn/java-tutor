package week6;

import java.util.ArrayList;

class Phonebook {
  ArrayList<Person> people = new ArrayList<Person>();

  public void add(String name, String number) {
    people.add(new Person(name, number));
  }

  public void printAll() {
    for (Person person : people) {
      System.out.println(person);
    }
  }

  public String searchNumber(String name) {
    for (Person person : people) {
      if(person.getName().equals(name)){
        return person.getNumber();
      }
    }
    return "Number not known";
  }
}

class Person {
  String name;
  String number;

  Person(String _name, String _number) {
    this.name = _name;
    this.number = _number;
  }

  public String toString() {
    return this.name + " number: " + this.number;
  }

  public String getName() {
    return this.name;
  }

  public String getNumber() {
    return this.number;
  }

  public void changeNumber(String newNumber) {
    this.number = newNumber;
  }

}

public class Ex94 {
  public static void main(String[] args) {
    Phonebook phonebook = new Phonebook();
    phonebook.add("Pekka Mikkola", "040-123123");
    phonebook.add("Edsger Dijkstra", "045-456123");
    phonebook.add("Donald Knuth", "050-222333");

    String number = phonebook.searchNumber("Pekka Mikkola");
    System.out.println( number );

    number = phonebook.searchNumber("Martti Tienari");
    System.out.println( number );
}
}
