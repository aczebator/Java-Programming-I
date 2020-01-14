import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int calc = Integer.parseInt(reader.nextLine());
        int count = 1;
        int sum = 1;
                
        while (count <= calc){
        sum *= count;
        count++;
        //System.out.println("Sum is " + sum);
        }
        System.out.println("Factorial is " + sum);
    }
}
