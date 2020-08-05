import java.util.ArrayList;
import java.util.Scanner;
/**
 * A class to hold information of courses and keep a list of all courses, along with their
 * corresponding instructors and participants
 *
 * @author Erdem Eren
 * @version 06.04.2020
 */
public class Course
{
    protected static ArrayList<Course> courseList = new ArrayList<Course>();
    protected String courseName;
    protected Instructor instructor;
    protected int courseCode;
    protected int numberOfStudents;
    private ArrayList<Student> classList;
    
    /**
     * Constructor for objects of class Course with their name, code and instructor, 
     * and adds them to the course list
     * 
     * @param courseName name of the course
     * @param courseCode code of the course 
     * @param instructor instructor of the course
     */
    public Course(String courseName, int courseCode, Instructor instructor)
    {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
        numberOfStudents = 0;
        courseList.add(this);
        classList = new ArrayList<Student>();
    }

    /**
     * Constructor for objects of class Course with their name and code, and 
     * adds them to the course list
     *
     * @param courseName name of the course
     * @param code of the course
     */
    public Course(String courseName, int courseCode)
    {
        this.courseName = courseName;
        this.courseCode = courseCode;
        numberOfStudents = 0;
        courseList.add(this);
        classList = new ArrayList<Student>();
    }
    
    /**
     * Adds the student with the given student number to the course participants
     * 
     * @param studentNo number of the student
     */
    public void addStudent(int studentNo){
        for(Student s : Student.studentList){
            if(s.studentNo == studentNo){
                classList.add(s);
                System.out.println(s.nameSurname + " added to " + courseName);
            }
        }
        numberOfStudents++;
    }
    
    /**
     * Removes the student with the given student number from the course participants
     * 
     * @param studentNo number of the student
     */
    public void dropStudent(int studentNo){
        classList.removeIf(i -> i.studentNo == studentNo);
        for(Student s : Student.studentList){
            if(s.studentNo == studentNo){
                System.out.println(" removed from " + courseName);
            }
        }
        numberOfStudents--;
    }
    
    /**
     * Prints the course participants
     */
    public void getStudents(){
        if(numberOfStudents == 0){
            System.out.println("No enrolled students in this course!");
        }else{
            System.out.println(courseName + "\n" + 
                               "***************************" );
            for(Student s : classList){
                System.out.println(s);
            }
            System.out.println("---------------------------\n" + 
                       "Total " + numberOfStudents + " students at this course." );
        }
    }
    
    /**
     * Prints the list of all courses
     */
    public static void getCourses() {
        if(courseList.size() == 0){ 
            System.out.println("Course list is empty!");
        }else{
            System.out.println("ALL COURSES\n" + 
                               "***********");
            for(Course course : courseList){
                if(course.instructor != null){
                    System.out.println(course.courseCode + " - " + course.courseName 
                                + " (" + course.instructor + ")");
                }else{
                    System.out.println(course.courseCode + " - " + course.courseName);
                }
            }
        }
    }
    
    /**
     * Removes the course with the given course code from the course list
     */
    public static void removeCourse(int courseCode) {
        if(courseList.size() == 0){ 
            System.out.println("Course list is already empty!");
        }else {
            if(courseList.removeIf(i -> i.courseCode == courseCode)){
                System.out.println("Course successfully removed.");
            }else{
                System.out.println("Course to be removed does not exist.");
            }
        }
    }
}
