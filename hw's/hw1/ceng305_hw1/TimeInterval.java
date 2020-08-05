
/**
   Calculates the time between two moments in terms of hours and minutes.
  
   @author Erdem Eren
   @version 03.11.2020
 */
public class TimeInterval
{
    
    private int timeHour;
    private int timeMinute;
    private String start;
    private String finish;

    /**
       Constructor for objects of class TimeInterval.
     */
    public TimeInterval()
    {
       
    }

    /**
       Reads the values and assigns them to class variables.
     
       @param start starting time of the work
       @param finish finish time of the work 
     */
    public void setTimes(String start, String finish)
    {
        this.start = start;
        this.finish = finish;
    }
    
    /**
       Converts the string variables to integer and calculates the hours inbetween. 
       @return The hours inbetween.
     */
    public int getHour()
    {
        int startingMin  = (Integer.parseInt(this.start))%100;
        int finishingMin = (Integer.parseInt(this.finish))%100;
        int starting  = (Integer.parseInt(this.start))/100;
        int finishing = (Integer.parseInt(this.finish))/100;
        if (starting > finishing)
            timeHour = finishing - starting + 24;
        else timeHour =  finishing - starting;
        if(startingMin > finishingMin)
            timeHour--;
        return timeHour;
    }
    
    /**
       Converts the string variables to integer and calculates the minutes inbetween.
       @return The minutes inbetween.
     */
    public int getMinute()
    {
        int starting  = (Integer.parseInt(this.start))%100;
        int finishing = (Integer.parseInt(this.finish))%100;
        if(starting > finishing)
            timeMinute = finishing - starting + 60;
        else timeMinute = finishing - starting;
        return timeMinute;
    }
    
    /**
       Prints out the time interval.
      
     */
    public void calculateTimeInterval()
    {
        System.out.println("Employee worked " + getHour() + " hours and " + getMinute() + " minutes");
    }
}
