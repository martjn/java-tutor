package week8;

import java.util.ArrayList;
import java.util.HashMap;

class RegistrationPlate {
  private final String regCode;
  private final String country;

  public RegistrationPlate(String country, String regCode) {
    this.regCode = regCode;
    this.country = country;
  }

  @Override
  public String toString() {
    return country + " " + regCode;
  }

  @Override
  public boolean equals(Object object) {
    RegistrationPlate compared = (RegistrationPlate) object;

    if (compared.regCode == this.regCode && compared.country == this.country) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    if (this.regCode == null || this.country == null) {
      return 7;
    }
    return this.regCode.hashCode() + this.country.hashCode();
  }

}

class VehicleRegister {
  HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

  public boolean add(RegistrationPlate plate, String owner) {
    if(!owners.containsKey(plate)){
      owners.put(plate, owner);
      return true;
    }
    if (owners.get(plate) == null) {
      owners.replace(plate, owner);
      return true;
    } else {
      return false;
    }
  }

  public String get(RegistrationPlate plate) {
    return owners.get(plate);
  }

  public boolean delete(RegistrationPlate plate) {
    if (owners.containsKey(plate)) {
      owners.remove(plate);
      return true;
    } else {
      return false;
    }
  }

  public void printRegistrationPlates() {
    System.out.println("All registration plates: ");
    owners.forEach((key, value) -> System.out.println(key.toString()));
  }
  public void printOwners(){
    ArrayList<String> ownerNames = new ArrayList<String>();
    owners.forEach((plate, owner) -> {
      if(!ownerNames.contains(owner)){
        System.out.println(owner);
      }
    });
  }
}

public class Ex9 {
  public static void main(String[] args) {
    RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
    RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
    RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");
    VehicleRegister register = new VehicleRegister();

    // 1. Test: Add a new registration plate.
    System.out.println("Test 1: Add a new registration plate:");
    boolean added = register.add(reg1, "Arto");
    System.out.println("Added " + reg1 + " -> " + added);

    // 2. Test: Try to add the same registration plate.
    System.out.println("\nTest 2: Try to add the same registration plate:");
    added = register.add(reg1, "Mikko");
    System.out.println("Added " + reg1 + " again -> " + added);

    // 7. Test: Check equality of plates.
    System.out.println("\nTest 7: Check equality of plates:");
    RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
    System.out.println(reg1 + " is equal to " + newPlate + " -> " + reg1.equals(newPlate)); // should print true
    register.add(reg1, "Arto");
    register.add(reg2, "Mikko");
    register.add(reg3, "Jürgen");
    register.printRegistrationPlates();
    register.printOwners();
  }
}
