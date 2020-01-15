import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
           Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by Goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top ten by penality points");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");  
        
        System.out.println("Statistics for Philadelphia Flyers by Goals");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
      
        System.out.println("Statistics for Anaheim Ducks");
        NHLStatistics.teamStatistics("ANA");
        
        
        
        //Print the statistics for Philadelphia Flyers (abbreviation: PHI). Note in which order the players are printed in and why that might be!
//Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
    }
}
