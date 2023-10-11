package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Card implements Comparable<Card> {
  public static final int SPADES = 0;
  public static final int DIAMONDS = 1;
  public static final int HEARTS = 2;
  public static final int CLUBS = 3;
  public static final String[] suitStrings = { "Spades", "Diamonds", "Hearts", "Clubs" };
  public static final String[] valueStrings = { "", "", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
      "A" };

  public int value;
  public int suit;

  public Card(int value, int suit) {
    this.value = value;
    this.suit = suit;
  }

  public String toString() {
    return valueStrings[value] + " of " + suitStrings[suit];
  }

  public int getSuit() {
    return this.suit;
  }

  public int getValue() {
    return this.value;
  }

  @Override
  public int compareTo(Card card) {
    if (this.value == card.value) {
      if (this.suit < card.suit) {
        return -1;
      } else if (this.suit > card.suit) {
        return 1;
      } else {
        return 0;
      }
    } else if (this.value < card.value) {
      return -1;
    } else {
      return 1;
    }
  }
}

class Hand implements Comparable<Hand> {
  ArrayList<Card> cards = new ArrayList<Card>();

  public void add(Card card) {
    cards.add(card);
  }

  public void print() {
    for (Card card : cards) {
      System.out.println(card);
    }
  }

  public void sort() {
    Collections.sort(cards);
  }

  @Override
  public int compareTo(Hand hand) {
    int insider = 0;
    int outsider = 0;
    for (Card card : cards) {
      insider += card.value;
    }
    for (Card card : hand.cards) {
      outsider += card.value;
    }
    if (insider < outsider) {
      return -1;
    } else if (insider > outsider) {
      return 1;
    } else {
      return 0;
    }
  }

  public void sortAgainstSuit() {
    Collections.sort(cards, new SortAgainstSuitAndValue());
  }
}

class SortAgainstSuit implements Comparator<Card> {
  public int compare(Card card1, Card card2) {
    return card1.getSuit() - card2.getSuit();
  }
}

class SortAgainstSuitAndValue implements Comparator<Card> {
  public int compare(Card card1, Card card2) {
    int temp = card1.getSuit() - card2.getSuit();
    if (temp == 0) {
      return card1.getValue() - card2.getValue();
    } else {
      return temp;
    }
  }
}

public class Ex15 {
  public static void main(String[] args) {
    Hand hand = new Hand();

    hand.add(new Card(12, Card.HEARTS));
    hand.add(new Card(4, Card.CLUBS));
    hand.add(new Card(2, Card.DIAMONDS));
    hand.add(new Card(14, Card.CLUBS));
    hand.add(new Card(7, Card.HEARTS));
    hand.add(new Card(2, Card.CLUBS));

    hand.sortAgainstSuit();

    hand.print();

  }
}
