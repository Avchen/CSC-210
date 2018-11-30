package Chapter11;

/**
 * Created by averychen on 4/24/17.
 */
public class Student {

    int studentId;
    String name;


    public Student(String name, int studentId){
        this.name = name;
        this.studentId = studentId;
    }

    void setName(String name){

        this.name = name;
    }

    void setStudentId(int studentId){
        this.studentId = studentId;
    }

}
