
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
       // int calc = Integer.parseInt(reader.nextLine());
        int calc = reader.nextInt();
        int count = 0;
        int sum = 0;
                
        while (count <= calc){
        sum += count;
        count++;
       // System.out.println("Sum is " + sum);
        }
        System.out.println("Sum is " + sum);
    }
}
