public class DeepCopy {
  public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gaurav";
        s1.rollno = 22;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 85;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 88;

        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }

  }
}


class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        
        for(int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }


    Student() {
        marks = new int[3];
        System.out.println("Copy Constructor");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int rollno) {
        marks = new int[3];
        this.rollno = rollno;
    }
}

