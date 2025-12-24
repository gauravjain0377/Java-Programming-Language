public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog potter = new Dog();
        potter.eat();
        potter.legs = 4;
        System.out.println(potter.legs);
    }
}

// Base Class
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}


// Derived Class
class Mammal extends Animal {
    int legs;
}

// Derived Class
class Dog extends Mammal {
    String breed;
}
