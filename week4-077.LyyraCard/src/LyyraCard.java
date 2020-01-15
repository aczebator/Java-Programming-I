/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aczebator
 */
public class LyyraCard {
  private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
        return "The card has " + this.balance  + " euros";
    }  

    public void payEconomical() {
    // write code here 2.5
    if (this.balance < 2.5){
        
    }
    else {
        this.balance = this.balance - 2.5;
    }
    
}


    public void payGourmet() {
    // write code here 4.0
       if (this.balance < 4.0){
    }
    else {
    this.balance = this.balance - 4.0;
}
      
    
}
    public void loadMoney(double amount) {
    // write code here
    double total = this.balance + amount; 
   
    if(amount <=0){
        
    }
    else if (total > 150.0){
        this.balance = 150.0;
    }
    else { this.balance = this.balance + amount;
    } 
  
}
    
    
}