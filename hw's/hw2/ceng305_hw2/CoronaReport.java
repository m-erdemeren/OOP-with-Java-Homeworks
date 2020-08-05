import javax.swing.JOptionPane;
import java.util.*;
/**
 * A program to create an ArrayList of Country objects, to find the longest country name 
 * and align the names accordingly to right, and to print barcharts of recovered and
 * dead ratios.
 *
 * @author Erdem Eren
 * @version 04.23.2020
 */
public class CoronaReport
{
    private int numberOfCountries;

    /**
     * Constructor for objects of class CoronaReport
     */
    public CoronaReport(int numberOfCountries)
    {
        this.numberOfCountries = numberOfCountries;
    }

    /**
     * Reads country name, number of deaths, number of recovered people as an input from the 
     * user and forms country objects, records country objects to an array list of countries.
     *
     * 
     * @return  the list of countries
     */
    public ArrayList<Country> readCountriesValues()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        JOptionPane frame = new JOptionPane();
        
        for(int i = 0; i < numberOfCountries; i++){
            String name = frame.showInputDialog(frame, "Please enter the "
                            + "name of the country:");
            int numberOfDead = Integer.parseInt(frame.showInputDialog(frame, 
                                "Please enter the number of deaths today:"));
            int numberOfRecovered = Integer.parseInt(frame.showInputDialog(frame, 
                                "Please enter the number of recovered today:"));
            Country country = new Country(name, numberOfDead, numberOfRecovered);
            countries.add(country);
        }
        
        return countries;
    }
    
    /**
     * Takes the list of countries and finds the country with the longest name.
     * 
     * @param countryList list of countries
     * @return maximum length of the country names in the list
     */
    public int findMaxLengthCountryName(ArrayList<Country> countryList){
        int maxLength = countryList.get(0).getName().length();
        
        for(int i = 1; i < numberOfCountries; i++){
            if(maxLength < countryList.get(i).getName().length())
                maxLength = countryList.get(i).getName().length();
        }
        
        return maxLength;
    }
    
    /**
     * Prints the name of countries and the corresponding recovered and dead ratios.
     * 
     * @param countryList the list of countries
     * @param maxName the length of the longest country name in countryList
     */
    public void printBarChart(ArrayList<Country> countryList, int maxName){
        for(int i = 0; i < numberOfCountries; i++){
            String name = countryList.get(i).getName();
            int length = name.length();
            while(length++ < maxName) name = " " + name;
            System.out.print(name + " ");
            for(int j = 0; j < countryList.get(i).calculateRatio(); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
