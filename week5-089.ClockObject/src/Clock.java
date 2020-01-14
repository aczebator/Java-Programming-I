public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
//        this.seconds = new BoundedCounter(secondsAtBeginning);
//        this.minutes = new BoundedCounter(minutesAtBeginning);
//        this.hours = new BoundedCounter(hoursAtBeginning);
        hours = new BoundedCounter(23);
        minutes = new BoundedCounter(59);
        seconds = new BoundedCounter(59);
         
        hours.setValue(hoursAtBeginning);
        minutes.setValue(minutesAtBeginning);
        seconds.setValue(secondsAtBeginning);
        
//      seconds.setValue(secondsAtBeginning);
//    System.out.println(seconds);
//      minutes.setValue(minutesAtBeginning);
//    System.out.println(minutes);
//      hours.setValue(hoursAtBeginning);
//    System.out.println(hours);
    }
    
    public void tick() {
        // Clock advances by one second
      // int sec = seconds.getValue();
       // sec = seconds.next();
       // seconds.setValue(sec);
        
       // System.out.println(hours + ":" +minutes + ":" +seconds);
            
            seconds.next();
            if (seconds.getValue() == 0){
                minutes.next();
                if (minutes.getValue()==0){
                    hours.next();
                                          }
                                }
//        }
      
    }
    
    public String toString() {
        // returns the string representation
        //return hours.getValue() +":"+ minutes.getValue() +":"+ seconds.getValue()+"";
       // int test1 = seconds.toString();
        return ""+ this.hours +":"+ this.minutes+":" + this.seconds;
    }
}
