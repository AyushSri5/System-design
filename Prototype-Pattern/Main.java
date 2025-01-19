public class Main {
    public static void main(String[] args) {
        Student std=new Student(12,"Ayush",10);
        Student clone=(Student) std.clone();
    }
}
