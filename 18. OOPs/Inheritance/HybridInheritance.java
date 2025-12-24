package Inheritance;
// Example of multilevel + hierarchical inheritance, not hybrid.


// Does Java support Multiple Inheritance?
// ❌ NO (with classes)
// Java does NOT support multiple inheritance using classes.

//  Does Java support Hybrid Inheritance?
//  ❌ NO (with classes)
//  Java does NOT support hybrid inheritance using classes either.

// But Java supports hybrid & multiple inheritance using interfaces


public class HybridInheritance {
    public static void main(String[] args) {
        Bird Eagles = new Bird();
        Eagles.eat();
        Eagles.fly();

        System.out.println();
        Dog Lucy = new Dog();
        Lucy.breathe();
        Lucy.bite();
    }
}
 

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flies");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Shark extends Fish {
    void hunt() {
        System.out.println("hunts");
    }
}

class Dog extends Mammal {
    void bite() {
        System.out.println("bites");
    }
}