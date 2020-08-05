/**
 * A program for creating country objects with name, daily number
 * of dead and recovered people, and for calculating the ratio of recovered and dead
 *
 * @author Erdem Eren
 * @version 04.23.2020
 */
public class Country
{
    private String name;
    private int dailyDeathNumber;
    private int dailyRecoveredNumber;

    /**
     * Constructor for objects of class Country
     * 
     * @param name name of the country
     * @param dailyDeathNumber the number of deaths  in the last day
     * @param dailyRecoveredNumber the number of recovered people in the last day
     */
    public Country(String name, int dailyDeathNumber, int dailyRecoveredNumber)
    {
        this.name = name;
        this.dailyDeathNumber = dailyDeathNumber;
        this.dailyRecoveredNumber = dailyRecoveredNumber;
    }

    /**
     * Returns the name of the country
     *
     * @return  the name of the country
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Calculates the ratio of dailyRecoveredNumber and dailyDeathNumber and returns the
     * results
     * 
     * @return the ratio of dailyRecoveredNumber and dailyDeathNumber
     */
    public int calculateRatio()
    {
        return (int) (dailyRecoveredNumber / dailyDeathNumber);
    }
}
