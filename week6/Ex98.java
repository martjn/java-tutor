package week6;

import java.util.Arrays;

public class Ex98 {

  public static int[] copy(int[] array) {
    int[] newArray = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }
    return newArray;
  }
  public static int[] reverseCopy(int[] array) {
    int[] newArray = new int[array.length];

    int i = 0;
    int j = array.length-1;

    while(i < array.length){
      newArray[i] = array[j];
      i++;
      j--;
    }

    return newArray;
  }

  public static void main(String[] args) {
    int[] original = { 1, 2, 3, 4 };
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println("original: " + Arrays.toString(original));
    System.out.println("reversed: " + Arrays.toString(reverse));
  }
}
