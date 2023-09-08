package week3;
import java.util.Scanner;

public class Ex69 {
  public static boolean palindrome(String text) {
    // write your code here
    String temp_text = text;
    String temp_text2 = "";
    for(int i = temp_text.length()-1; i >= 0; i--){
      temp_text2 += temp_text.charAt(i);
    }
    if(temp_text2.equals(text)){
      return true;
    }
    else{
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a text: ");
    String text = reader.nextLine();
    if (palindrome(text)) {
      System.out.println("The text is a palindrome!");
    } else {
      System.out.println("The text is not a palindrome!");
    }
  }
}
