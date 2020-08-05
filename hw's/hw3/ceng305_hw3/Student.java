import java.util.ArrayList;
import java.util.Scanner;
/**
 * A class to hold information of students and keep a list of all students.
 *
 * @author Erdem Eren
 * @version 06.04.2020
 */
public class Student extends Person
{
    protected static ArrayList<Student> studentList = new ArrayList<Student>();
    protected int studentNo;
    private int entranceYear;

    /**
     * Constructs a Student object with their student number, name, surname, 
     * age and entrance year, and adds it to the class variable studentList
     * 
     * @param studentNo student number of the student
     * @param nameSurname name and surname of the student
     * @param age age of the student
     * @param entranceYear entrance year of the student
     */
    public Student(int studentNo, String nameSurname, int age, int entranceYear)
    {
        super(nameSurname, age);
        this.studentNo = studentNo;
        this.entranceYear = entranceYear;
        studentList.add(this);
    }

    /**
     * Constructs a Student object with their student number, name, surname and 
     * entrance year and adds it to the class variable studentList
     * 
     * @param studentNo student number of the student
     * @param nameSurname name and surname of the student
     * @param entranceYear entrance year of the student
     */
    public Student(int studentNo, String nameSurname, int entranceYear)
    {
        super(nameSurname);
        this.studentNo = studentNo;
        this.entranceYear = entranceYear;
        studentList.add(this);
        this.age = 0;
    }
    
    /**
     * Prints the student information
     */
    public void getStudentInfo(){
        System.out.println("Name Surname  : " + nameSurname);
        if(age > 0){
            System.out.println("Age           : " + age);
        }
        System.out.println("Entrance Year : " + entranceYear);
    }
    
    /**
     * Prints all of the students with their student numbers
     */
    public static void getStudents() {
        if(studentList.size() == 0){
            System.out.println("Student list is empty!");
        }else{
            System.out.println("ALL STUDENTS\n"+
                           "************");
            for(Student student : studentList){
                System.out.println(student.studentNo + " - " + student.nameSurname);
            }
        }
    }
    
    /**
     * Removes the student with the given student number from the student list
     */
    public static void removeStudent(int studentNo){
        if(studentList.size() == 0){
            System.out.println("Student list is already empty!");
        }else{
            if(studentList.removeIf(i -> i.studentNo == studentNo)){
                System.out.println("Student successfully removed.");
            }else{
                System.out.println("Student to be removed does not exist!");
            }
        }
    }
    
    /**
     * Alters the string representation of the object.
     * 
     * @return name and surname of the student
     */
    @Override
    public String toString(){
        return nameSurname;
    }
}
