class Iteration {
  public static void main(String[] args) {

    // create a string
    String name = "Programming";

    System.out.println("Characters in " + name + " are:");

    // loop through each element
    for(int i = 0; i<name.length(); i++) {

      // access each character
      char a = name.charAt(i);
      System.out.print(a + ", ");
    }
  }
}
/*
Characters in Programming are:
P, r, o, g, r, a, m, m, i, n, g,
*/