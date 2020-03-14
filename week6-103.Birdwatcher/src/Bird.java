/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrianneczebator
 */
public class Bird {
    String name;
    String latin;
    int observation;
    
    
    public Bird (String name, String latin){
        this.name = name;
        this.latin = latin;
        this.observation = 0;
    }
    public void Observation(){
        this.observation++;
    }
    
    public String getBird(){
        return this.name;
    }
   public String toString(){
       return this.name + " ("+ this.latin+") : " + this.observation + " observations";
   } 
   
}
