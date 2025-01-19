public class Student implements Prototype{
    private int age;
    private String name;
    private int rollNumber;

    public Student(int age,String name,int rollNumber){
        this.age=age;
        this.name=name;
        this.rollNumber=rollNumber;
    }
    @Override
    public Prototype clone() {
        return new Student(age,name,rollNumber);
    }
}
