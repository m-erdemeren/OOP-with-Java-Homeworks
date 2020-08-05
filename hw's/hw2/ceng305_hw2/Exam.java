import java.util.*;
/**
 * A program to create and sort an ArrayList of Student objects.
 *
 * @author Erdem Eren
 * @version 04.23.2020
 */
public class Exam
{
    private int x;
    private ArrayList<Student> studentList;

    /**
     * Constructor for objects of class Exam
     */
    public Exam()
    {
        studentList = new ArrayList<Student>();
    }

    /**
     * Takes the student name and exam score as arguments and adds the student to the array
     * list of the students
     *
     * @param  studentName the name of the student
     * @param score  the exam score of the student
     */
    public void addExamScore(String studentName, double score)
    {
        Student s = new Student(studentName, score);
        studentList.add(s);
    }
    
    /**
     * Sorts the list by scores and returns the names of the highest scoring three students.
     * 
     * @return the names of the best three students
     */
    public String nameOfBestStudent()
    {
        Collections.sort(studentList, Comparator.comparing(Student :: getScore).reversed());
        String best = studentList.get(0).getName();
        String secondBest = studentList.get(1).getName();
        String thirdBest = studentList.get(2).getName();
        return best + " and " + secondBest + " and " + thirdBest ;
    }
}
