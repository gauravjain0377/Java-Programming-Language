public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Octopus o = new Octopus();
        h.eat();
        h.walk();

        // Animal a = new Animal();  =?> this is wrong.
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();   
}

class Horse extends Animal {
    void changeColor() {
        color = "dark brown";

    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Octopus extends Animal {
     void changeColor() {
        color = "red";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
