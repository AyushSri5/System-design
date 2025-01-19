import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;
    public Student(StudentBuilder studentBuilder){
        this.rollNumber=studentBuilder.rollNumber;
        this.name=studentBuilder.name;
        this.fatherName=studentBuilder.fatherName;
        this.motherName=studentBuilder.motherName;
        this.age=studentBuilder.age;
    }
    public String toString(){
        return "Name:"+this.name+"Age:"+this.age;
    }
}
