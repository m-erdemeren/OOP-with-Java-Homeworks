import java.util.*;
import javax.swing.JOptionPane;
/**
 * A test class for testing classes Exam, CoronaReport and TicTacToe
 *
 * @author Erdem Eren
 * @version 04.23.2020
 */
public class Test
{
    public static void main(String[] args)
    {
        JOptionPane frame = new JOptionPane();
        Scanner sc = new Scanner(System.in);
        int question = -1;
        while(question != 0){
            System.out.println("Press 1 for Question 1. \n"
                             + "Press 2 for Question 2. \n" 
                             + "Press 3 for Question 3. \n"
                             + "Press 0 to exit.");
            question = sc.nextInt();
            switch(question){
            default: 
                break; 
               
            case 1: 
                Exam exam = new Exam();
                int T = Integer.parseInt(frame.showInputDialog(frame, "Please " 
                       + "enter the number of students who entered the exam:"));
                for(int i = 0; i<T; i++){
                    String name = frame.showInputDialog("Please enter the name "
                                  + "of the student");
                    double score = Double.parseDouble(frame.showInputDialog(frame, 
                                    "Please enter the exam score of the student:"));
                    exam.addExamScore(name, score);
                }
                String res = "The best three students are: " + exam.nameOfBestStudent();
                frame.showMessageDialog(frame, res);
                break;
            case 2:
                int N = Integer.parseInt(frame.showInputDialog(frame, "Please "
                        + "enter the number of countries:"));
                CoronaReport rep = new CoronaReport(N);
                ArrayList<Country> list = rep.readCountriesValues();
                int max = rep.findMaxLengthCountryName(list);
                rep.printBarChart(list, max);
                break;
            case 3:
                TicTacToe game = new TicTacToe();
                game.playGame();
                
                break;
            }
        }
        sc.close();
    }

    
}
