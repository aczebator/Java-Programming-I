import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
System.out.print("Type the first number: ");
        int number = Integer.parseInt(reader.nextLine()); 
System.out.print("Type the second number: ");
        int number2 = Integer.parseInt(reader.nextLine());     

        if (number > number2) {
           System.out.print("Greater number: " + number); 
        }
        else if (number2 > number){
            System.out.print("Greater number: " + number2); 
        }
        else {
        System.out.print("The numbers are equal!"); 
        }
    
    }
}
// Type the first number: 5
// Type the second number: 3

// Greater number: 5