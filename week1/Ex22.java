import java.util.Scanner;

public class Ex22 {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String secret_password = "martin";
    String secret_code = "";
    for(int i = 0; i < secret_password.length(); i++){
      if(Character.isWhitespace(secret_password.charAt(i))){
        secret_code += " ";
      }
      else{
        int ascii = secret_password.charAt(i);
        int new_ascii = ascii + 13;
        char new_char = (char) new_ascii;
        secret_code += new_char;
      }

    }

    while(true){
      
      try {
        System.out.println("Type the password: ");
        String ans = reader.nextLine();
        if(ans.equals(secret_password)){
          System.out.println("Right!");
          System.out.println("The secret is: " + secret_code);
          break;
        }
        else{
          System.out.println("Wrong!");
        }
      } catch (Exception e) {
        System.out.println("Error: something went wrong!");
        break;
      }
    }

  }

}
