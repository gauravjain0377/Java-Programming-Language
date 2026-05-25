package Constructors;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();

         
    }
}


class Student {
     String name;
     int rollNo;

    //   Student() {    // Constructor
            // System.out.println();
    //  }

     Student() {   // Constructor
        System.out.println("Constructor is Called");
     }

    
}