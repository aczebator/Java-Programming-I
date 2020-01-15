
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());   // Reads a line from the users keyboard
      System.out.print("Type another number:");
        int number2 = Integer.parseInt(reader.nextLine());   // Reads a line from the users keyboard
        
        int number3 = Math.max(number, number2);
        
        System.out.println("The bigger number of the two numbers given was: " + number3);
        
    }
}
