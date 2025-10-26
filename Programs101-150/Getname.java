import java.io.File;

class Getname {

  public static void main(String[] args) {

    // link to file Test.class
    File file = new File("File path\Test.class");

    // get file name using getName()
    String fileName = file.getName();
    System.out.println("File Name: " + fileName);

  }
}
