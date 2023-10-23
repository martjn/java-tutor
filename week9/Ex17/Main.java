package week9.Ex17;

import week9.Ex17.mooc.logic.ApplicationLogic;
import week9.Ex17.mooc.ui.UserInterface;
import week9.Ex17.mooc.ui.TextUserInterface;

public class Main {

  public static void main(String[] args) {
    UserInterface ui = new TextUserInterface();
    new ApplicationLogic(ui).execute(3);
  }
}
