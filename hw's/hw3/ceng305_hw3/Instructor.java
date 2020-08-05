import java.util.ArrayList;
/**
 * A class to hold information of instructors and keep a list of all instructors.
 *
 * @author Erdem Eren
 * @version 06.01.2020
 */
public class Instructor extends Person
{
    public static ArrayList<Instructor> instructorsList = new ArrayList<Instructor>();
    
    /**
     * Constructs objects of class Instructor and adds the object to the class variable instructorsList 
     * 
     * @param nameSurname name and surname of the instructor
     * @param age age of the instructor
     */
    public Instructor(String nameSurname, int age)
    {
        super(nameSurname, age);
        instructorsList.add(this);
    }

    /**
     * Removes the instructor with the given id from the instructor list
     *
     * @param  id  id number of the instructor
     */
    public static void removeInstructor(int id)
    {
        if(instructorsList.size() == 0){
            System.out.println("Instructor list is already empty!");
        }else{
            instructorsList.remove(id-1);
        }
    }
    
    /**
     * Prints the list of all instructors with their IDs.
     */
    public static void getInstructors() {
        if(instructorsList.size() == 0){
            System.out.println("Instructor list is empty!");
        }else{
            System.out.println("ALL INSTRUCTORS\n"+
                           "***************\n" + 
                           "ID  Name Surname");
            for(int i = 0; i < instructorsList.size(); i++){
                System.out.println((i+1) + "   " + instructorsList.get(i));
            }
        }
    }
    
    /**
     * Alters the string representation of the object.
     * 
     * @return name and surname of the instructor
     */
    @Override
    public String toString(){
        return nameSurname;
    }
}
