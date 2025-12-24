import Constructors.Student;

package Inheritance;
public class NonParametrizedConst {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}

class Student {
    String name;
    int rollno;

    Student() {
        System.out.println("Non-Parameterized Constructor");
    }
}
