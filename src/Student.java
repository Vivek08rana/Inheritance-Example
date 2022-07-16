/**
 This program stores the personal information that represents students
 */
import java.util.ArrayList;

public class Student {
    private String name;
    private String phoneNumber;
    private ArrayList<String> courseList = new ArrayList<>(); //contains all the courses
    private static int id = 999;

    //CONSTRUCTOR
    /**
     * Sets up personal information for student
     * @param name of student
     * @param phoneNumber of student
     */
    public Student(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        //Increase id to ensure every student has a different id
        id++;
        }

    //GETTER METHODS
    /**
     * @return the student's name
     */
    public String getStudentName(){
        System.out.println("Student Name: " + this.name);
        return this.name;
    }
    /**
     * @return the student's phone number
     */
    public String getStudentPhone(){
        System.out.println("Phone Number: " + this.phoneNumber);
        return this.phoneNumber;
    }

    /**
     *
     * @return
     */
    public int getStudentId(){
        System.out.println("Student ID: " + id);
        return id;
    }

    //COURSE SYSTEM
    /**
     * Adds a course to the course list
     * @param courseName to add to course list
     * @return true if course is added otherwise false
     */
    public boolean addCourse(String courseName){
        if (this.getCourseCount() >= 5){
            System.out.println("Course load is full.");
            System.out.println("Current Courses: " + courseList);
            return false;
        }
        this.courseList.add(courseName);
        System.out.println("The course, " + courseName + ", has been added.");
        System.out.println("Current Courses: " + courseList);
        return true;
    }

    /**
     * Drops a course from the course list
     * @param courseName to remove from course list
     * @return true if course is dropped otherwise false
     */
    public boolean dropCourse(String courseName){
        if (courseList.contains(courseName)){
            this.courseList.remove(courseName);
            System.out.println("The course, " + courseName + ", has been dropped.");
            System.out.println("Current Courses: " + courseList);
            return true;
        }
        System.out.println("This course does not exist.");
        System.out.println("Current Courses: " + courseList);
        return false;
    }

    /**
     * @return the current amount of courses that the student has
     */
    public int getCourseCount(){
        return this.courseList.size();
    }

    //ACCESS TO LIBRARY AND RESEARCH LAB
    /**
     * Checks if the student has access to library
     * @return true if student has access to the library otherwise false
     */
    public boolean hasAccessToLibrary(){
        if (this.getCourseCount() > 0){
            System.out.println(this.name + " has access to the library.");
            return true;
        }
        System.out.println(this.name + " does not have access to the library.");
        return false;
    }

    /**
     * Checks if student has access to the research lab
     * @return false since no student has access to the research lab
     */
    public boolean hasAccessToResearchLab(){
        System.out.println(this.name + " does not have access to the research lab.");
        return false;
    }
}
