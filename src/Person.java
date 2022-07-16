/**
 This program is a superclass that stores information and methods common for students and instructors
 */
public abstract class Person {
    private String name;
    private String phoneNumber;
    private String type;
    private static int id = 999;

    //CONSTRUCTOR
    /**
     * Sets up constructor for student and instructor
     * @param name of student or instructor
     * @param phoneNumber of student or instructor
     * @param type of person (student or instructor)
     */
    public Person(String name, String phoneNumber, String type){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
        //Increase id to ensure every student has a different id
        id++;
    }

    //GETTER METHODS - COMMON FOR INSTRUCTOR AND STUDENT
    /**
     * @return name of student or instructor
     */
    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }

    /**
     * @return phone number of student or instructor
     */
    public String getPhoneNumber() {
        System.out.println("Phone Number: " + phoneNumber);
        return phoneNumber;
    }

    /**
     * @return id of student or instructor
     */
    public int getID(){
        System.out.println("ID: " + id);
        return id;
    }

    /**
     * @return the type of person (student or instructor)
     */
    public String getType() {
        System.out.println("Type: " + type);
        return type;
    }

    //OVERRIDDEN METHODS BASED ON IF STUDENT OR INSTRUCTOR
    public abstract boolean hasAccessToLibrary(); //Gets overridden by subclass method

    public abstract boolean hasAccessToResearchLab(); //Gets overridden by subclass method
}
