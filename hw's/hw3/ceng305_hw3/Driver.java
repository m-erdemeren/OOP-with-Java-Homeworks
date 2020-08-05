import java.util.*;
/**
 * The program to manage the Student Automation System
 *
 * @author Erdem Eren
 * 06.01.2020
 */
public class Driver
{
    public static void main(String[] args) 
    {
        String choices = "1. Courses List \n" +
                         "2. Add/Remove Course \n" + 
                         "3. Course Students (<courseCode>) \n" + 
                         "4. Instructors List \n" + 
                         "5. Add/Remove Instructor \n" + 
                         "6. Students List \n" + 
                         "7. Add/Remove Student \n" + 
                         "8. Student Info (<studentNo>) \n" + 
                         "9. Add/Remove Student to/from the Course \n" + 
                         "Press 0 for exit. \n";
        
        System.out.println("Student Automation Project (Enter the Choice)\n"
                          +"*********************************************");
        
        Student stu;
        Course course;
        Instructor ins;
        Scanner in = new Scanner(System.in);
        int choice = -1;
        while(choice != 0){
            System.out.println("\n" + choices);
            try{
                choice = in.nextInt();
                if(choice < 0 || choice > 9){
                    System.out.println("Choice is invalid! \n" + 
                                       "Try again. \n");
                    continue;
                }else{
                    switch(choice){
                        default: 
                            break;
                        case 1: 
                            Course.getCourses();
                            break;
                        case 2:
                            Scanner sc2 = new Scanner(System.in);
                            
                            course = null;
                            ins = null;
                            System.out.println("Add course     : " +
                                "add # <courseCode> # <courseName>");
                            System.out.println("Add course     : " +
                                "add # <courseCode> # <courseName> # <instructorID>");
                            System.out.println("Remove course  : " +
                                "remove # <courseCode>");
                                
                            String[] input = sc2.nextLine().split(" # ");
                            
                            String query = input[0];
                            int courseCode = Integer.parseInt(input[1]);
                            String courseName;
                            int insID;
                            
                            if(query.equals("add")){
                                if(input.length == 3){
                                    courseName = input[2];
                                    course = new Course(courseName, courseCode);
                                }else if(input.length == 4){
                                    courseName = input[2];
                                    insID = Integer.parseInt(input[3]);
                                    ins = Instructor.instructorsList.get(insID - 1);
                                    course = new Course(courseName, courseCode, ins);
                                }else{
                                    System.out.println("Invalid data entry");
                                }
                            }else if(query.equals("remove")){
                                if(input.length == 2){
                                    course.removeCourse(courseCode);
                                }else{
                                    System.out.println("Invalid data entry");
                                }
                            }else{
                                System.out.println("Invalid query");
                            }
                            sc2.close();
                            break;
                        case 3:
                            Scanner sc3 = new Scanner(System.in);
                            
                            System.out.println("Enter course code :");
                            int code = sc3.nextInt();
                            for(Course c : Course.courseList){
                                if(c.courseCode == code){
                                    c.getStudents();
                                }
                            }
                            sc3.close();
                            break;
                        case 4:
                            Instructor.getInstructors();
                            break;
                        case 5:
                            Scanner sc5 = new Scanner(System.in);
                        
                            System.out.println("Add Instructor     : " +
                                         "add # <nameSurname> # <age>");
                            System.out.println("Remove Instructor  : " +
                                            "remove # <instructor ID>");
                                            
                            ins = null;
                            input = sc5.nextLine().split(" # ");
                            query = input[0];
                            String nameSurname;
                            int insAge;
                            if(query.equals("add")){
                                if(input.length == 3){
                                    nameSurname = input[1];
                                    insAge = Integer.parseInt(input[2]);
                                    ins = new Instructor(nameSurname, insAge);
                                }else{
                                    System.out.println("Invalid data entry");
                                }
                            }else if(query.equals("remove")){
                                if(input.length == 2){
                                    insID = Integer.parseInt(input[1]);
                                    Instructor.removeInstructor(insID);
                                }else{
                                    System.out.println("Invalid data entry");
                                }
                            }else{
                                System.out.println("Invalid query");
                            }
                            sc5.close();
                            break;
                        case 6:
                            Student.getStudents();
                            break;
                        case 7:
                            Scanner sc7 = new Scanner(System.in);
                        
                            System.out.println("Add Student     : " +
                            "add # <student number> # <name surname> #" + 
                            " <entrance year>");
                            System.out.println("Add Student     : " +
                            "add # <student number> # <name surname> #" + 
                            " <age> # <entrance year>");
                            System.out.println("Remove Student  : " +
                            "remove # <student number>");
                            
                            stu = null;
                            
                            input = sc7.nextLine().split(" # ");
                            int stuNo;
                            int entYear;
                            int stuAge;
                            query = input[0];
                            if(query.equals("add")){
                                if(input.length == 4){
                                    stuNo = Integer.parseInt(input[1]);
                                    nameSurname = input[2];
                                    entYear = Integer.parseInt(input[3]);
                                    stu = new Student(stuNo, nameSurname, entYear);
                                }else if(input.length == 5){
                                    stuNo = Integer.parseInt(input[1]);
                                    nameSurname = input[2];
                                    stuAge = Integer.parseInt(input[3]);
                                    entYear = Integer.parseInt(input[4]);
                                    stu = new Student(stuNo, nameSurname, stuAge, entYear);
                                }else{
                                    System.out.println("Invalid data entry");
                                }
                            }else if(query.equals("remove")){
                                if(input.length == 2){
                                    stuNo = Integer.parseInt(input[1]);
                                    Student.removeStudent(stuNo);
                                }else{
                                    System.out.println("Invalid data entry");
                                }
                            }else{
                                System.out.println("Invalid query");
                            }
                            sc7.close();
                            break;
                        case 8:
                            Scanner sc8 = new Scanner(System.in);
                            System.out.println("Enter student no :");
                            int no = sc8.nextInt();
                            System.out.println("Student Info  : " + no);
                            System.out.println("*********************************");
                            for(Student s : Student.studentList){
                                if(s.studentNo == no){
                                    s.getStudentInfo();
                                }
                            }
                            sc8.close();
                            break;
                        case 9:
                            Scanner sc9 = new Scanner(System.in);
                        
                            System.out.println("Add Student to the Course       : " +
                                            "add # <student number> # <courseCode>");
                            System.out.println("Remove Student from the Course  : " +
                                         "remove # <student number> # <courseCode>");
                                         
                            input = sc9.nextLine().split(" # ");
                            query = input[0];
                            
                            if(query.equals("add")){
                                if(input.length == 3){
                                    stuNo = Integer.parseInt(input[1]);
                                    courseCode = Integer.parseInt(input[2]);
                                    for(Course c : Course.courseList){
                                        if(c.courseCode == courseCode){
                                            c.addStudent(stuNo);
                                        }
                                    }
                                }else{
                                    System.out.println("Invalid data entry");
                                }
                            }else if(query.equals("remove")){
                                if(input.length == 3){
                                    stuNo = Integer.parseInt(input[1]);
                                    courseCode = Integer.parseInt(input[2]);
                                    for(Course c : Course.courseList){
                                        if(c.courseCode == courseCode){
                                            c.dropStudent(stuNo);
                                        }
                                    }
                                }else{
                                    System.out.println("Invalid data entry");
                                }
                            }else{
                                System.out.println("Invalid query");
                            }
                            sc9.close();
                            break;
                    }
                }
            }catch(InputMismatchException e){
                System.out.println("Choice is not an integer! \n" + 
                                   "Try again. \n");
                in.next();
            }
        }
    }
}
