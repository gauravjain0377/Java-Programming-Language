package Constructors;
import Inheritance.Student;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();

         
    }
}


class Student {
     String name;
     int rollNo;

    //   Student() {    // Constructor
    
    //  }

     Student() {   // Constructor
        System.out.println("Constructor is Called");
     }

    
}