public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
        d.breathe();

        Animal a = new Animal();
        a.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }

    void breathe() {
         System.out.println("breathes");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
}
}
