
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
  
    public static void main(String[] args) {
//        Scanner name = new Scanner(System.in);  // Create a Scanner objec
//        Scanner number = new Scanner(System.in);
//        Scanner searched = new Scanner(System.in);
        
        Scanner reader = new Scanner(System.in);
        
        String userName = "";
        String userNumber = "";
        ArrayList<Student> list = new ArrayList<Student>();

        do
        {
        System.out.print("name: ");
        userName = reader.nextLine(); 
        if (userName.length()>0) {
        System.out.print("studentnumber: ");
        userNumber = reader.nextLine(); 
        list.add(new Student(userName, userNumber));
            }
        else {
            break;
        }
        //Student newStudent = new Student(userName, userNumber);
        }
        while (true);
      
  
          // for (Student prs : Student)
          for (Student prs : list) {
            System.out.println( prs );
            }
          System.out.println("");
          System.out.print("Give search term: ");
            String search = reader.nextLine();
        
        System.out.println("Result: ");
         for (Student prs : list) {
           // System.out.println( prs.contains(search) );
             if (prs.getName().contains(search)) {
                 System.out.println(prs);
             }
 
           //System.out.println(list.contains(search));
            }
    }
       
    }

  