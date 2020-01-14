import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
    private ArrayList<Integer> numbersMain;
    
    public LotteryNumbers() {
        // We'll format a list for the numbers
       // this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
       // int x = random.nextInt();
       //int x = 0; 
        //numbers.add(x);
        this.numbers = new ArrayList<Integer>();
        this.numbersMain = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int counter = 1;
        while(counter<8) {
            int bound = 1 * this.random.nextInt(39) + 1;
            if (this.containsNumber(bound)) {
               // this.numbers.add(1 * this.random.nextInt(39 ) + 1);
                counter--;
            }
            else{
                this.numbers.add(bound);
               // counter ++;
            }
           counter++;
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if(this.numbers.contains(number)){
            return true;
        }
        else{
            return false;
        }

    }  
}  
    
