
import java.util.ArrayList;
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    ArrayList<Bird> birdDB = new ArrayList<Bird>();
    
        
        Scanner reader = new Scanner(System.in);  
        while(true){
           System.out.println("? ");
            String command = reader.nextLine();
           // System.out.println(command);
            
        if ("Add".equals(command)){
            System.out.print("Name:");
            String name = reader.nextLine();
            System.out.print("Latin Name:");
            String latin = reader.nextLine();
            Bird newBird = new Bird(name, latin);
            birdDB.add(newBird);
        }
        else if ("Observation".equals(command)){
            System.out.println("What was observed?");
            String obs = reader.nextLine();
           
            for(Bird i : birdDB){
                    if(i.getBird().equals(obs)){
                        i.Observation();
                    } else {
                        System.out.println("Is not a bird!");
                    }
                }
            
           // System.out.println("Observed" + bird);
           // Observation
          // Observation.addObservation();
        }
        else if ("Statistics".equals(command)){
           // System.out.println("ALL THE BIRD STUFF"); 
            for (Bird i : birdDB){
                System.out.println(i);
            }
        }
        else if ("Show".equals(command)){
            System.out.print("What? ");
            String what = reader.nextLine();
           
            for(Bird i : birdDB)
            {
                if(i.getBird().equals(what)){
                    System.out.println(i);
                }
            }
            
            //System.out.println("BIRD STUFF HERE" + what);
        }
        else if ("Quit".equals(command)){
            break;
        }
    }
    }

}
