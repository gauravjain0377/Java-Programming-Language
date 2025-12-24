// Herbivore     Carnivore
//      \           /
//       \         /
//           Bear
// This question example for the Multiple Inheritance using interfaces.



public class MultipleInheritancebyInterface {
    public static void main(String[] args) {
        Bear animal = new Bear();
        animal.eats();
    }
}


interface Herbivore {
    void eats();
}

interface Carnivore {
   void eats();
}


class Bear implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("Grass + Meat");

    }

}