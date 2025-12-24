// so no output as error is there, for practice to learn one concept.

package PracticeQuestion;

public class Question6 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print1();    //    => this will give error

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
} 


class Vehicle {
    void print() {
        System.out.println("Base Class (Vehicle)");
    }
}

class Car extends Vehicle {
    void print1() {
        System.out.println("Derived Class (Car)");
    }
}

