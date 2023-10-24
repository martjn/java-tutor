package week10.Ex29;

import week10.Ex29.people.Person;
import week10.Ex29.people.Student;
import week10.Ex29.people.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void printDepartment(List<Person> people) {
    for (Person person : people) {
      System.out.println(person);
    }
  }

  public static void main(String[] args) {
    List<Person> people = new ArrayList<Person>();
    people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
    people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));

    printDepartment(people);
  }
}
