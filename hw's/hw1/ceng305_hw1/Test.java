import javax.swing.JOptionPane;
import java.util.*;
/**
   Test class for the classes TimeInterval, Employee and DaysOfMonths
  
   @author Erdem Eren
   @version 03.20.2020
 */
public class Test
{
    
    public static void main(String[] args){
        JOptionPane frame = new JOptionPane();
        Scanner scan = new Scanner(System.in);
        
        int question = -1;
        while(question != 0){
            System.out.println("Press 1 for Question 1. \n"
                             + "Press 2 for Question 2. \n" 
                             + "Press 3 for Question 3. \n"
                             + "Press 0 to exit.");
            question = scan.nextInt();
        switch(question){
            default: 
                break; 
               
            case 1: 
                TimeInterval time = new TimeInterval();
                String start = frame.showInputDialog(frame, "Enter the starting moment.");
                String finish = frame.showInputDialog(frame, "Enter the finishing moment.");
                time.setTimes(start, finish);
                int timeHour = time.getHour();
                int timeMinutes = time.getMinute();
                String res = "Employee worked " + timeHour + 
                             " hours and " + timeMinutes + " minutes";
                frame.showMessageDialog(frame, res);
                break;
            case 2:
                Employee emp = new Employee();
                String name = frame.showInputDialog(frame, "Enter the name of the employee.");
                emp.setName(name);
                double workHours = Double.parseDouble(frame.showInputDialog(frame, "Enter the work hours of the employee."));
                double paymentPerHour = Double.parseDouble(frame.showInputDialog(frame, "Enter the payment per hour for the employee."));
                emp.setWorkHoursPaymentPerHour(workHours, paymentPerHour);
                frame.showMessageDialog(frame, name + " will be paid " + emp.getPayment() + " dollars for each week.");
                break;
            case 3:
                DaysOfMonths dom  = new DaysOfMonths();
                int monthId = Integer.parseInt(frame.showInputDialog(frame, "Enter the month id."));
                dom.setMonthId(monthId);
                frame.showMessageDialog(frame, "This month has " + dom.getLength() + " days.");
                break;
            
        }
        
        }
        scan.close(); 
        
       
    }

    
}