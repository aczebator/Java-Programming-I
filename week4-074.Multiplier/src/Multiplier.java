/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aczebator
 */
public class Multiplier {
    private int number;
    
    public Multiplier(int startNumber){
        this.number = startNumber;
            }
    
    public int multiply(int otherNumber){
       int result = this.number * otherNumber;
        
        return result;
}
}
