/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrianneczebator
 */
import java.util.Random;

public class NightSky {
    private int width;
    private int height;
    private double density;
   private int starsInLastPrint;
    
    public NightSky(double density){
        this.width = 20;
        this.height = 10;
        this.density = density;
        
    }
    public NightSky(int width, int height){
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }
    public NightSky(double density, int width, int height) {
        this.width = width;
        this.height = height;
        this.density = density;
        this.starsInLastPrint = 0;
    }
    public void print(){
        this.starsInLastPrint = 0;
        for(int count = 0; count <height; count ++){
            this.printLine();
            System.out.println("");
        }
    }
    public void printLine(){
        for (int counter = 0; counter < this.width; counter++){     
        Random random = new Random();
            
        double randNum = random.nextDouble();
            if (randNum <= this.density) {          
                System.out.print("*");
               this.starsInLastPrint++;    
            } 
            else {
                System.out.print(" ");     
    }    
        }
}
    public int starsInLastPrint() {             
        return this.starsInLastPrint;
    }
}
