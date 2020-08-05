
/**
   A class for getting the month lengths.
 
   @author Erdem Eren
   @version 03.15.2020
 */
public class DaysOfMonths
{
    private int monthId;
    private int monthDay;

    /**
       Constructor for objects of class DaysOfMonths
     */
    public DaysOfMonths()
    {
        
    }

    /**
       The setter method for the variable monthId
      
       @param  monthId  Number of the month
     */
    public void setMonthId(int monthId)
    {
        this.monthId = monthId;
    }
    
    /**
       Assigns the length of month to the variable monthDay
        
       @return the length of the month 
     */
    public int getLength()
    {
        if((this.monthId == 1) || (this.monthId == 3) || (this.monthId == 5) ||
           (this.monthId == 7) || (this.monthId == 8) || (this.monthId == 10) || 
           (this.monthId == 12))
            monthDay = 31;
        else if((this.monthId == 4) || (this.monthId == 6) || 
                (this.monthId == 9) || (this.monthId == 11))
            monthDay = 30;
        else monthDay = 28;
        return monthDay;
        
    }
}
