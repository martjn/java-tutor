package week4;

import java.util.Random;

class PasswordRandomizer {
  // Define the variables here
  private int passwordLength;

  public PasswordRandomizer(int length) {
    // Format the variable here
    this.passwordLength = length;
  }

  public String createPassword() {
    // Write the code here which returns the new password
    String temp = "";
    Random random = new Random();
    for (int i = 0; i < passwordLength; i++) {
      int newAsciiValue = random.nextInt((122 - 97) + 1) + 97;
      char newChar = (char) newAsciiValue;
      temp += newChar;
    }
    return temp;
  }
}

public class Ex81 {
  public static void main(String[] args) {
    PasswordRandomizer randomizer = new PasswordRandomizer(13);
    System.out.println("Password: " + randomizer.createPassword());
    System.out.println("Password: " + randomizer.createPassword());
    System.out.println("Password: " + randomizer.createPassword());
    System.out.println("Password: " + randomizer.createPassword());
  }
}
