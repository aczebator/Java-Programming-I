
import java.util.Scanner;
//36import java.lang.math.*;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the radius: ");
        int number = Integer.parseInt(reader.nextLine());   // Reads a line from the users keyboard
        
        double cir = 2 * Math.PI * number;
        
                System.out.println("Circumference of the circle:  " +cir);
    }
}
