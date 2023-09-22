package week6;

import java.util.Arrays;

public class Ex104 {
  public static void main(String[] args) {
    int[] values = { 8, 3, 7, 9, 1, 2, 4 };
    sort(values);
  }

  public static int smallest(int[] array) {
    // write the code here
    int track = array[0];
    for (int num : array) {
      if (num < track) {
        track = num;
      }
    }
    return track;
  }

  public static int indexOfTheSmallest(int[] array) {
    // code goes here
    int smallest = smallest(array);
    int tracker = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == smallest) {
        tracker = i;
      }
    }
    return tracker;
  }

  public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    // write the code here
    int temp_array[] = new int[array.length - index];
    int i = index;
    for (int j = 0; j < temp_array.length; j++) {
      temp_array[j] = array[i];
      i++;
    }
    return indexOfTheSmallest(temp_array) + index;
  }

  public static void swap(int[] array, int index1, int index2) {
    int tempValue1 = array[index1];
    int tempValue2 = array[index2];

    array[index1] = tempValue2;
    array[index2] = tempValue1;

  }

  public static void sort(int[] array) {
    int lastIndex = array.length;
    int currIndex = 0;

    
    while(currIndex < lastIndex){
      System.out.println(Arrays.toString(array));
      int smallest = indexOfTheSmallestStartingFrom(array, currIndex);
      swap(array, currIndex, smallest);

      currIndex++;
    }
  }
}
