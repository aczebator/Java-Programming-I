
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrianneczebator
 */
public class Phonebook {
    private ArrayList<Person> phoneBook;
    
    public Phonebook() {
   this.phoneBook = new ArrayList<Person>();
    }
    
    public void add(String name, String number){

     phoneBook.add(new Person(name, number));
     
    }
    public void printAll(){
        for(Person members : phoneBook){
            System.out.println(members);
    }
        
    }
    public String searchNumber(String name){
        for (Person person:phoneBook){
            if(person.getName().contains(name)){
            return person.getNumber();
            }
        }
            return "number not known";
            
        
    }
    
}
