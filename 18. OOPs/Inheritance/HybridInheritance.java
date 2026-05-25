package Inheritance;
/* Hybrid inheritance means:

Combination of two or more inheritance types

So:

✅ Multiple + Multilevel → Hybrid
✅ Multiple + Hierarchical → Hybrid
✅ Multilevel + Hierarchical → Hybrid
✅ Single + Multilevel → Hybrid
 */


// Does Java support Multiple Inheritance?
// ❌ NO (with classes)
// Java does NOT support multiple inheritance using classes.

//  Does Java support Hybrid Inheritance?
//  ❌ NO (with classes)
//  Java does NOT support hybrid inheritance using classes either.

// But Java supports hybrid & multiple inheritance using interfaces



/* Java class support summary:

Single → Yes
Multilevel → Yes
Hierarchical → Yes
Multiple → No
Hybrid with multiple inheritance → No
Hybrid without multiple inheritance → Yes
 */


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