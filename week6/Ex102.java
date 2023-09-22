package week6;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex102 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<Integer>();

    System.out.println("Type exam scores, -1 completes:");
    while (true) {
      int nextInt = reader.nextInt();
      if (nextInt == -1) {
        break;
      } else {
        scores.add(nextInt);
      }
    }
    System.out.println("Scores: " + scores);

    int[] tracker = new int[] { 0, 0, 0, 0, 0, 0 };
    System.out.println("Grade distribution: ");
    for (int score : scores) {
      if (score < 0 && score > 60) {
        ;
      } else if (score <= 29) {
        tracker[0] += 1;

      } else if (score >= 30 && score <= 34) {
        tracker[1] += 1;
      } else if (score >= 35 && score <= 39) {
        tracker[2] += 1;
      } else if (score >= 40 && score <= 44) {
        tracker[3] += 1;
      } else if (score >= 45 && score <= 49) {
        tracker[4] += 1;
      } else if (score >= 50 && score <= 60) {
        tracker[5] += 1;
      }
    }

    for (int i = 5; i >= 0; i--) {
      int times = tracker[i];
      System.out.print(i + ": ");
      for (int j = 0; j < times; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.print("Acceptance percentage: ");

    int acceptedGradesCount = tracker[1] + tracker[2] + tracker[3] + tracker[4] + tracker[5];
    double prC = (double) acceptedGradesCount / (double) scores.size() * 100;

    System.out.print(prC);
    reader.close();
  }
}
