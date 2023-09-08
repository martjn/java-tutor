package week3;

public class Ex51 {

  public static void main(String[] args){
    separateCharacters("Martin");
  }
  public static void separateCharacters(String name){
    int count = 1;
    for(int i = 0; i < name.length(); i++){
      System.out.println(i+1 + ". character: " + name.charAt(i));
    }

  }
  
  
}
