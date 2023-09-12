package week4;

public class HangmanLogic {

  private String word;
  private String guessedLetters;
  private int numberOfFaults;

  public HangmanLogic(String word) {
    this.word = word.toUpperCase();
    this.guessedLetters = "";
    this.numberOfFaults = 0;
  }

  public int numberOfFaults() {
    return this.numberOfFaults;
  }

  public String guessedLetters() {
    return this.guessedLetters;
  }

  public int losingFaultAmount() {
    return 12;
  }

  public void guessLetter(String letter) {
    if (this.guessedLetters.contains(letter)) {
      return;
    }

    else {
      this.guessedLetters += letter;
      this.numberOfFaults++;
    }

  }

  public String hiddenWord() {
    String temp_word = "";
    for(int i = 0; i < this.word.length(); i++){
      temp_word += "_";
    }
    
    // program here the functionality for building the hidden word

    for(int i = 0; i < this.word.length(); i++){
      char ch = this.word.charAt(i);
      if(this.guessedLetters.indexOf(ch) != -1){
        char[] temp_temp_word = temp_word.toCharArray();
        temp_temp_word[i] = ch;
        temp_word = String.valueOf(temp_temp_word);
      }
    }

    // create the hidden word by iterating through this.word letter by letter
    // if the letter in turn is within the guessed words, put it in the hidden word
    // if the letter is not among the guessed ones, replace it with _ in the hidden
    // word

    // return the hidden word at the end

    return temp_word;
  }

  public static void main(String[] args) {
    HangmanLogic l = new HangmanLogic("martin");
    System.out.println("word is: " + l.hiddenWord());

    System.out.println("guessing: M, A, S, F, N");
    l.guessLetter("M");
    l.guessLetter("A");
    l.guessLetter("S");
    l.guessLetter("F");
    l.guessLetter("N");
    System.out.println("guessed letters: " + l.guessedLetters());
    System.out.println("number of faults: " + l.numberOfFaults());
    System.out.println("word now: " + l.hiddenWord());
  }
}