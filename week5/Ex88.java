package week5;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
  String name;
  String studentNumber;

  Student(String name, String studentNumber) {
    this.name = name;
    this.studentNumber = studentNumber;
  }

  public String getName() {
    return this.name;
  }

  public String getStudentNumber() {
    return this.studentNumber;
  }

  public String toString() {
    return this.name + " (" + this.studentNumber + ")";
  }
}

public class Ex88 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Student> list = new ArrayList<Student>();

    while (true) {
      System.out.print("name: ");
      String name = reader.nextLine();
      if (name.isEmpty()) {
        break;
      }
      System.out.print("studentnumber: ");
      String studentNumber = reader.nextLine();

      Student temp_student = new Student(name, studentNumber);
      list.add(temp_student);

    }

    for (Student student : list) {
      System.out.println(student);
    }

    System.out.print("Give search term: ");
    String searchTerm = reader.nextLine();

    for(Student student: list){
      if(student.getName().contains(searchTerm)){
        System.out.println(student);
      }
    }

  }
}
