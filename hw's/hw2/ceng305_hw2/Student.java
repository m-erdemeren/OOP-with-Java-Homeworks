
/**
 * A program to create student objects with their names and scores.
 *
 * @author Erdem Eren
 * @version 04.23.2020
 */
public class Student
{
    private String name;
    private double score;
    
    /**
     * Constructor for objects of class Student
     * 
     * @param name the name of the student
     * @param score the exam score of the student
     */
    public Student(String name, double score)
    {
        this.name = name;
        this.score = score;
    }

    /**
     * Returns the name of the student
     *
     * @return    the name of the student
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Returns the exam score of the student
     * 
     * @return  the exam score of the student
     */
    public double getScore()
    {
        return this.score;
    }
}
