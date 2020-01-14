
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

         while(true){
       // System.out.println("Add to graph? [no to exit]");
        //String add = reader.nextLine();
        
       // if (add.equals("no")) {
         //   break;  
         //}
       // else 
            System.out.println("add a value!");
        double number = Double.parseDouble(reader.nextLine());
        if (number > 40 || number < -29){
            
        }
        else{
            Graph.addNumber(number);
        }
        // Write your code here
    //}
       // System.out.println("Cool!");
        //System.out.println("BYE!");
        
        // Graph is used as follows:
        // Graph.addNumber(7);
        // double value = 13.5;
        // Graph.addNumber(value);
        // value = 3;
        // Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }}}

