package week6;

import java.util.ArrayList;

class Book {
  private String title;
  private String publisher;
  private int year;

  public Book(String title, String publisher, int year) {
    this.title = title;
    this.publisher = publisher;
    this.year = year;
  }

  public String title() {
    return this.title;
  }

  public String publisher() {
    return this.publisher;
  }

  public int year() {
    return this.year;
  }

  public String toString() {
    return this.title + ", " + this.publisher + ", " + this.year();
  }
}

class Library {
  ArrayList<Book> books;

  public Library() {
    books = new ArrayList<Book>();
  }

  public void addBook(Book newBook) {
    books.add(newBook);
  }

  public void printBooks() {
    for (Book book : books) {
      System.out.println(book);
    }
  }

  public ArrayList<Book> searchByTitle(String title) {
    ArrayList<Book> temp = new ArrayList<Book>();
    for (Book book : books) {
      if (book.title().trim().toUpperCase().contains(title.toUpperCase())) {
        temp.add(book);
      }
    }
    return temp;
  }

  public ArrayList<Book> searchByPublisher(String publisher) {
    ArrayList<Book> temp = new ArrayList<Book>();
    for (Book book : books) {
      if (book.publisher().trim().toUpperCase().contains(publisher.trim().toUpperCase())) {
        temp.add(book);
      }
    }
    return temp;
  }

  public ArrayList<Book> searchByYear(int year) {
    ArrayList<Book> temp = new ArrayList<Book>();
    for (Book book : books) {
      if (book.year() == year) {
        temp.add(book);
      }
    }
    return temp;
  }

}

public class Ex101 {
  public static void main(String[] args) {
    Library Library = new Library();

    Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
    Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
    Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
    Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

    for (Book book : Library.searchByTitle("CHEESE")) {
      System.out.println(book);
    }

    System.out.println("---");
    for (Book book : Library.searchByPublisher("PENGUIN  ")) {
      System.out.println(book);
    }

  }
}
