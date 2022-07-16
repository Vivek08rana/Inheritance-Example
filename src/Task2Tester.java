public class Task2Tester {
    public static void main(String[] args) {
        //STUDENT 1 JEROME
        Student2 jerome = new Student2("Jerome", "905-229-3355");
        System.out.println("STUDENT INFORMATION: ");
        //Methods from super class it has access to
        jerome.getName();
        jerome.getID();
        jerome.getPhoneNumber();
        jerome.getType();
        //Methods from Student2 that Instructor cannot access
        System.out.println("\nCOURSE CHANGES: ");
        jerome.addCourse("Science");
        jerome.addCourse("Math");
        jerome.dropCourse("Science");
        System.out.println("Amount of Courses: " + jerome.getCourseCount());
        System.out.println("\nACCESS INFORMATION: ");
        //Access Methods
        jerome.hasAccessToLibrary();
        jerome.hasAccessToResearchLab();

        //INSTRUCTOR 1 COLE
        Instructor cole = new Instructor("Cole", "905-056-5522","Instructor");
        System.out.println("\nINSTRUCTOR INFORMATION: ");
        //Methods from super class it has access to
        cole.getName();
        cole.getID();
        cole.getPhoneNumber();
        cole.getType();
        //Methods from Instructor that Student2 cannot access
        System.out.println("\nTOPIC CHANGES: ");
        cole.setResearchTopic("Economics");
        //Access Methods
        cole.hasAccessToLibrary();
        cole.hasAccessToResearchLab();

        //Student 2 Steve
        Student2 steve = new Student2("Steve", "647-553-9082");
        System.out.println("\nSTUDENT INFORMATION: ");
        steve.getName();
        steve.getID();
        steve.getPhoneNumber();
        steve.getType();
    }
}
