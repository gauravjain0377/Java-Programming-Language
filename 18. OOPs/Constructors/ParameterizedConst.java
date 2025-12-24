package Constructors;
public class ParameterizedConst {
    public static void main(String[] args) {
        Student s1 = new Student("Gaurav");
        Student s2 = new Student(22);

       System.out.println(s1.name);
        System.out.println(s2.rollno);
        
    }
}

class Student {
    String name;
    int rollno;

    Student(String name) {
        this.name = name;
    }
    Student(int rollno) {
        this.rollno = rollno;
    }
}
