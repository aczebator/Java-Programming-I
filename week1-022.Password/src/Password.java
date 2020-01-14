
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        while(true){
            
        System.out.println("Type the password:");
        String password2 = reader.nextLine();
        
        if (password2.equals(password)) {
            break;
        }
        else 
            System.out.println("Wrong!");
        
        // Write your code here
    }
        System.out.println("Right!");
        System.out.println("SECRET!");
        
}
}
