import java.util.HashMap;

class UpdateHash {
  public static void main(String[] args) {

    HashMap<String, Integer> numbers = new HashMap<>();
    numbers.put("First", 1);
    numbers.put("Second", 2);
    numbers.put("Third", 3);
    System.out.println("HashMap: " + numbers);

    // return the value of key Second
    int value = numbers.get("Second");

    // update the value
    value = value * value;

    // insert the updated value to the HashMap
    numbers.put("Second", value);
    System.out.println("HashMap with updated value: " + numbers);
  }
}
/*
HashMap: {Second=2, Third=3, First=1}
HashMap with updated value: {Second=4, Third=3, First=1}
*/