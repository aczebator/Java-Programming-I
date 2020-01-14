
import java.util.Scanner;

        
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
       
        System.out.print("seconds: ");
        int s = reader.nextInt();
        System.out.print("minutes: ");
        int m = reader.nextInt();// read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = reader.nextInt();// read the initial value of hours from the user

        seconds.setValue(s);
        System.out.println(seconds);
        minutes.setValue(m);
        System.out.println(minutes);
        hours.setValue(h);
        System.out.println(hours);
            
        
        
        int i = 0;
        while ( i < 121) {
            
            System.out.println(hours + ":" +minutes + ":" +seconds);
            
            seconds.next();
            if (seconds.getValue() == 0){
                minutes.next();
                if (minutes.getValue()==0){
                    hours.next();
                                          }
                                }
            
           // if (seconds.getValue() == 59 && minutes.getValue() == 59){
             //   hours.next();
               //     }
                 //   if (seconds.getValue() == 59){
               // minutes.next();
              //  /
                //}
           // seconds.next();             
           //System.out.println( hours + ":" + minutes + ":"+ seconds);
            i++;
        }
    }
}