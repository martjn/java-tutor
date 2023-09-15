package week5;

class Apartment {
  private int rooms;
  private int squareMeters;
  private int pricePerSquareMeter;

  public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
    this.rooms = rooms;
    this.squareMeters = squareMeters;
    this.pricePerSquareMeter = pricePerSquareMeter;
  }

  public int getSquareMeters() {
    return this.squareMeters;
  }

  public int getApartmentPrice() {
    return this.squareMeters * this.pricePerSquareMeter;
  }

  public boolean larger(Apartment otherApartment) {
    return this.squareMeters > otherApartment.getSquareMeters();
  }

  public int priceDifference(Apartment otherApartment) {
    return Math.abs(getApartmentPrice() - otherApartment.getApartmentPrice());
  }

  public boolean moreExpensiveThan(Apartment otherApartment) {
    return (getApartmentPrice() > otherApartment.getApartmentPrice());
  }
}

public class Ex87 {
  public static void main(String[] args) {
    Apartment studioManhattan = new Apartment(1, 16, 5500);
    Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
    Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

    System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn)); // false
    System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));
  }
}
