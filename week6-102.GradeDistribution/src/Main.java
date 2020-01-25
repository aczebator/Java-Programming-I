import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        ArrayList<Integer> grades = new ArrayList<Integer>();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        System.out.println("Type exam scores, -1 completes:");
        while(true){
        int number = Integer.parseInt(reader.nextLine()); 
        if (number > 60){
            
        }
        else if (number > 49) {
        //   System.out.print("Grade: 5");
           grades.add(5);
        }
        else if (number>44){
       //     System.out.print("Grade: 4"); 
            grades.add(4);
        }
        else if (number>39){
       //     System.out.print("Grade: 3"); 
            grades.add(3);
        }
        else if (number>34){
       //     System.out.print("Grade: 2"); 
            grades.add(2);
        }
        else if (number>29){
        //    System.out.print("Grade: 1"); 
            grades.add(1);
        }
        else if (number> -1){
            grades.add(0);
        }
        else if (number == -1){
            break;
        }
        else {
       // System.out.print("Grade: failed"); 
       
        }
        
       // myArray = grades.toArray(myArray)
       
           
       }
        System.out.println("Grade distribution:");
        //int grade = 5;
        for (int grade = 5; grade >= 0; grade --){
        System.out.print(grade + ": ");
            for(int i = 0; i<Collections.frequency(grades, grade);i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        int sum = 0;
        int accepted = 0;
        for(int i = 0; i<grades.size();i++){
            if(grades.get(i)>0){
                accepted++;
                sum++;
            }
            else{
                sum++;
            }
        }
       // System.out.println(sum);
        //System.out.println(accepted);
        System.out.println("Acceptance percentage: "+ 100*((double)accepted/(double)sum));

         
            
            
      //  for (int i = 0; i <grades.size();i++) {
        //    System.out.println(grades.get(i) + "");
    

   // }

    }
     
}


