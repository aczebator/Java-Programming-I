import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private String alpha;  
    private Random random;
    

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.alpha = "abcdefghijklmnopqrstuvwxyz";
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
       // char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
        String password = "";
        
        for(int i = 0; i< length; i++){
        password += alpha.charAt(this.random.nextInt(alpha.length()));
                    }
        return password.toString();
    }
}
