package week7;
import java.util.HashMap;

public class Ex5 {
  public static void main(String[] args){
    HashMap<String, String> nicknames = new HashMap<String, String>();
    nicknames.put("matti", "mage");
    nicknames.put("mikael", "mixu");
    nicknames.put("arto", "arppa");

    System.out.println(nicknames.get("mikael"));
  }
}
