import java.util.Scanner;
public class PrintInt{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        System.out.println("You entered: " + number);
    }
}
/*
Enter a number: 678
You entered: 678
 */