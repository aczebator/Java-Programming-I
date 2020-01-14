/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrianneczebator
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter (int upperLimit){
        //this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public int getValue(){
        return value; 
    }
    
    public void setValue (int value){
        if (value > -1 && value <= upperLimit){
        this.value = value;
            }
        else {this.value = 0; 
    }
    }
    
    
    public void next (){
        
        if (upperLimit <= value) 
            {
            value = 0;
            }
            else {
                    //this.value ++;
                    value ++;
        }
    }
        
    
    public String toString(){
        if (value < 10) {
            return "0" + value; 
        }
        else {
        return "" + value;
        }
    }
}
