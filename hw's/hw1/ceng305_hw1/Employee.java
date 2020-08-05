
/**
   An Employee with his/her name, work hours
 
   @author Erdem Eren
   @version 03.10.2020
 */
public class Employee
{
    
    private String name;
    private double payment;
    private double paymentPerHour;
    private double workHours;
    /**
       Constructor for objects of class Employee
     */
    public Employee()
    {
       
    }

    /**
       Sets the name of the employee
    
       @param name name of the employee 
    
     */
    public void setName(String name) 
    {
        this.name = name;
        
    }
    
    /**
       Sets the work hours and the payment per hour
     
       @param workHours total hours that the employee worked in a week
       @param paymentPerHour the money paid to the employee per hour
     */
    public void setWorkHoursPaymentPerHour(double workHours, double paymentPerHour)
    {
        this.workHours = workHours;
        this.paymentPerHour = paymentPerHour;
    }
    
    /**
       Calculates and returns the payment
      
       @return the payment
     */
    public double getPayment()
    {
        if(this.workHours > 40){
            this.payment = (40*this.paymentPerHour) + 
            (this.workHours - 40)*(this.paymentPerHour*1.5);
        }
        else this.payment = this.workHours * this.paymentPerHour; 
        return this.payment;
    }
    
}
