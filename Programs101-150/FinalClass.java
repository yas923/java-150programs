final class Immutable {

  // private class members
  private String name;
  private int date;

  Immutable(String name, int date) {

    // class members are initialized using constructor
    this.name = name;
    this.date = date;
  }

  // getter method returns the copy of class members
  public String getName() {
    return name;
  }

  public int getDate() {
    return date;
  }

}

class FinalClass {
  public static void main(String[] args) {

    // create object of Immutable
    Immutable obj = new Immutable("Talent Battle", 2011);

    System.out.println("Name: " + obj.getName());
    System.out.println("Date: " + obj.getDate());
  }
}

/*
Name: Talent Battle
Date: 2011
*/
