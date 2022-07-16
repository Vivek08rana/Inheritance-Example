/**
 This program is a subclass that contains the methods that are unique to or work differently for instructors
 */
public class Instructor extends Person{

    private String courseId;
    private String researchTopic; //default is none/null
    private String name;

    //CONSTRUCTOR - CALLS SUPER CLASS CONSTRUCTOR
    /**
     * Sets up personal information of instructor
     * @param name of instructor
     * @param phoneNumber of instructor
     * @param courseId of instructor
     */
    public Instructor(String name, String phoneNumber, String courseId){
        super(name, phoneNumber, "Instructor");
        this.courseId = courseId; //only needed for methods in this class
    }

    //INSTRUCTOR METHODS
    /**
     * Sets the research topic of the instructor
     * @param topic that the instructor researches
     * @return true after research topic has been set
     */
    public boolean setResearchTopic(String topic){
        this.researchTopic = topic;
        System.out.println("Research topic has been set to " + researchTopic + ".");
        return true;
    }

    /**
     * @return the research topic of the instructor
     */
    public String getTopic(){
        return researchTopic;
    }

    //ACCESS TO LIBRARY AND RESEARCH LAB
    /**
     * Checks if instructor has access to the library
     * @return true because all instructors can access the library
     */
    public boolean hasAccessToLibrary(){
        System.out.println("This instructor has access to library.");
        return true;
    }

    /**
     * Checks if instructor has access to research lab
     * @return true if instructor has access to research lab otherwise returns false
     */
    public boolean hasAccessToResearchLab(){
        if(getTopic() == null || getTopic().equalsIgnoreCase("None")){ //if no research topic is set
            System.out.println("This instructor does not have access to research lab.");
            return false;
        }
        System.out.println("This instructor has access to research lab.");
        return true;
    }
}
