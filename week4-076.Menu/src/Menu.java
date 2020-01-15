
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal){
      if (meals.contains(meal)) {      
      }
      else {
          meals.add(meal);
      }
    }
    public void printMeals(){
      // System.out.println(meals);
      for (String element:meals){
          System.out.println(element);
      }
    }
// add the methods here
   public void clearMenu(){
       meals.clear();
   } 
}
