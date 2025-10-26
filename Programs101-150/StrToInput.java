import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class StrToInput {

  public static void main(String args[]) {

    // Creates a string
    String name = "Talent Battle";
    System.out.println("String is: " + name);

    try {

      InputStream stream = new ByteArrayInputStream(name.getBytes(StandardCharsets.UTF_8));
      System.out.println("InputStream: " + stream);

      // Returns the available number of bytes
      System.out.println("Available bytes at the beginning: " + stream.available());

      // Reads 3 bytes from the stream stream
      stream.read();
      stream.read();
      stream.read();

      // After reading 3 bytes
      // Returns the available number of bytes
      System.out.println("Available bytes at the end: " + stream.available());

      stream.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}

/*
String is: Talent Battle
InputStream: java.io.ByteArrayInputStream@7adf9f5f
Available bytes at the beginning: 13
Available bytes at the end: 10
*/