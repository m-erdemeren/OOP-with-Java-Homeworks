/**
 * A class to create Person objects which has name and age fields.
 *
 * @author Erdem Eren   
 * @version 05.25.2020
 */
public class Person
{
    protected String nameSurname;
    protected int age;

    /**
     * Constructor for objects of class Person with their name, surname and age
     * 
     * @param nameSurname name and surname of the person
     * @param age age of the person
     */
    public Person(String nameSurname, int age)
    {
        this.nameSurname = nameSurname;
        this.age = age;
    }

    /**
     * Constructor for objects of class Person with their name and surname
     * 
     * @param nameSurname name of the person
     */
    public Person(String nameSurname){
        this.nameSurname = nameSurname;
    }
}
