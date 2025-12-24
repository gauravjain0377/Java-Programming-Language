public class AbstractClassConst {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang

        
    }
}

abstract class Animal {
    String color;

    Animal() {
       System.out.println("Animal Constructor Called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();   
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor called");
    }
    void changeColor() {
        color = "dark brown";

    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor called");
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
