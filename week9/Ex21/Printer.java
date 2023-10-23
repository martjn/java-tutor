package week9.Ex21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
  Scanner reader;
  String filePath;

  public Printer(String filePath) throws Exception {
    this.filePath = filePath;
  }

  public void printLinesWhichContain(String word) throws FileNotFoundException {
    this.reader = new Scanner(new File(this.filePath), "UTF-8");
    while (reader.hasNextLine()) {
      String line = reader.nextLine();
      if (line.contains(word)) {
        System.out.println(line);
      }
    }
  }

  public static void main(String[] args) {
    Printer printer = null;
    try{
      printer = new Printer("week9/Ex21/textfile.txt");
    }
    catch(Exception e){
      System.out.println("File not found");
    }

    try{

      printer.printLinesWhichContain("Väinämöinen");
      System.out.println("-----");
      printer.printLinesWhichContain("Frank Zappa");
      System.out.println("-----");
      printer.printLinesWhichContain("");
      System.out.println("-----");
    }
    catch(Exception e){
      System.out.println("File not found bruh");
    }
  }
}
