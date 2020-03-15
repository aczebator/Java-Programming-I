import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        //int i = howManyTimesHalvable(upperLimit-lowerLimit);
//int i = -1;
//while(i >= 0){
//while(true){
while(true){
    if(lowerLimit == upperLimit){
        System.out.println("The number you're thinking of is "+ upperLimit);
        break;
    }
    
    
    if(this.isGreaterThan(this.average(lowerLimit, upperLimit))){
        lowerLimit = this.average(lowerLimit,upperLimit)+1;
    }
    else {
        upperLimit = this.average(lowerLimit, upperLimit);
        
    }
       // i++;
        //System.out.println("upper:" + upperLimit);
        //System.out.println("lower: "+ lowerLimit);
        //System.out.println("i: "+ i);
        //System.out.println("avg: "+ average(lowerLimit,upperLimit));
        //System.out.println("halvable: "+ howManyTimesHalvable(upperLimit-lowerLimit));
    
     
}
        
        
    
    }
    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than "+ value+"?");
        String command = reader.nextLine();
        if (command.equals("y")){
         return true;   
        }
        else
        {
            return false;
        }
    }
    public int average(int firstNumber, int secondNumber){
      int avg = (firstNumber + secondNumber)/2;
     // Math.round(avg);
        return avg;
    }
}
