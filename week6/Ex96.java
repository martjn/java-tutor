package week6;

public class Ex96 {
  public static void main(String[] args) {
    int[] array = { 5, 1, 3, 4, 2 };
    System.out.println(sum(array));
  }

  public static int sum(int[] array) {
    int temp = 0;
    for(int num : array){
      temp += num;
    }
    return temp;
  }
}
