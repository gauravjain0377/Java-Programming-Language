package PracticeQuestion;

public class Question2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Gaurav";
        System.out.println(s.name);
    }
}

class Person {
    String name;
    int weight;
}

class Student extends Person {
    int rollNumber;
    String schoolName;
}