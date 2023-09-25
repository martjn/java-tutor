package week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Dictionary {
  HashMap<String, String> translations = new HashMap<String, String>();

  public String translate(String word) {
    return this.translations.get(word);
  }

  public void add(String word, String translation) {
    this.translations.put(word, translation);
  }

  public int amountOfWords() {
    return translations.size();
  }

  public ArrayList<String> translationList() {
    ArrayList<String> temp_array = new ArrayList<String>();

    for (String key : translations.keySet()) {
      temp_array.add(key + " = " + translations.get(key));
    }
    return temp_array;
  }
}

class TextUserInterface {
  Scanner reader;
  Dictionary dictionary;

  public TextUserInterface(Scanner reader, Dictionary dictionary) {
    this.reader = reader;
    this.dictionary = dictionary;
  }

  public void start() {
    System.out.println("Statements:");
    System.out.println("\tquit - quit the text user interface");
    System.out.println("\ttranslate - asks a word and prints its translation");
    System.out.println("\tadd - add word to dictionary");
    while (true) {
      System.out.print("Statement: ");
      String nextLine = reader.nextLine();
      if (nextLine.equals("quit")) {
        System.out.println("Goodbye!");
        break;
      }

      else if (nextLine.equals("add")) {
        System.out.print("In Finnish: ");
        String inFinnish = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        this.dictionary.add(inFinnish, translation);
      }

      else if (nextLine.equals("translate")){
        System.out.print("Give a word: ");
        String givenWord = reader.nextLine();
        System.out.println("Translation: " + dictionary.translate(givenWord));
      }

      else {
        System.out.println("Unknown statement");
      }
    }
  }
}

public class Ex7 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    Dictionary dict = new Dictionary();

    TextUserInterface ui = new TextUserInterface(reader, dict);
    ui.start();
  }
}
