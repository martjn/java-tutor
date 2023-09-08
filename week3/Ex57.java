package week3;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex57 {
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    ArrayList<String> wordList = new ArrayList<String>();


    while(true){
      System.out.print("Type a word: ");
      String word = reader.nextLine();
      if(word.isEmpty()){
        System.out.println("You typed the following words:");
        for(String string: wordList){
          System.out.println(string);
        }
        break;
      }
      wordList.add(word);
    }
  }
  
}
