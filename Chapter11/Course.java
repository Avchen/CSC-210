package Chapter11;

/**
 * Created by averychen on 4/19/17.
 */
/**
 * /*****************************************
 *                  Course
 *___________________________________________
 * -courseName: String
 * -students: ArrayList<String>
 * -numberOfStudents: int
 * +Course(courseName: String): void
 * +getCourseName(): String
 * +addStudent(Student: String): void
 * +dropStudent(student: String): void
 * +getStudents(): String[]
 * +getNumberOfStudents(): int
 * ****************************************/


import java.util.ArrayList;
public class Course {

    // Data fields
    private String courseName;
    private ArrayList<String> students;

    // Constructor
    /** Create a Course **/
    public Course (String courseName){
        this.courseName = courseName;
        students = new ArrayList<String>();
    }

    // Methods
    /** Add a student to the list **/
    public void addStudent(String student) {

        students.add(student);
    }

    /** Return students in an array **/
    public String[] getStudents() {
        String[] a = new String[students.size()];
        return students.toArray(a);
    }

    /** Return number of students **/
    public int getNumberOfStudents() {

        return students.size();
    }

    /** Return course name **/
    public String getCourseName() {

        return courseName;
    }

    /** Drop a student from list **/
    public void dropStudent(String student) {

        students.remove(student);
    }

}

class TestCourse {
    public static void main (String [] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Keith Brown");
        course2.addStudent("Tyrone Jones");
        course2.addStudent("John Baker");

        System.out.println("Number of students inn course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for(int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
            System.out.println();
            System.out.print("Number of students in course2: " + course2.getNumberOfStudents());

    }
}
