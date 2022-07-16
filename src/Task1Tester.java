public class Task1Tester {
    public static void main(String[] args) {
        //STUDENT 1 JEROME
        Student jerome = new Student("Jerome", "905-229-3355");
        System.out.println("STUDENT INFORMATION: ");
        jerome.getStudentName();
        jerome.getStudentPhone();
        jerome.getStudentId();
        System.out.println("\nCOURSE CHANGES: ");
        jerome.addCourse("Science");
        jerome.addCourse("Math");
        jerome.dropCourse("Science");
        System.out.println("Amount of Courses: " + jerome.getCourseCount());
        System.out.println("\nACCESS INFORMATION: ");
        jerome.hasAccessToLibrary();
        jerome.hasAccessToResearchLab();

        //Student 2 Steve
        Student steve = new Student("Steve", "647-553-9082");
        System.out.println("\nSTUDENT INFORMATION: ");
        steve.getStudentName();
        steve.getStudentPhone();
        steve.getStudentId();
    }
}
