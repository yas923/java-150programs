class Method {

  // calculate the sum
  public int add(int a, int b) {

    // calculate sum
    int sum = a + b;
    return sum;
  }

  // calculate the square
  public void square(int num) {
    int result = num * num;
    System.out.println(result);    // prints 576
  }
  public static void main(String[] args) {

    Method obj = new Method();

    // call the square() method
    // passing add() as an argument
    obj.square(obj.add(15, 9));

  }
}

/*
Output:

576
*/
