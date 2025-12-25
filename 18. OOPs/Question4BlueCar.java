abstract class Car {

    static {
        System.out.print("1");
    }

    {
        System.out.print("3");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }
}

public class Question4BlueCar extends Car {

    static {
        System.out.print("4");
    }

    public Question4BlueCar() {
        super("blue");
        System.out.print("5");
    }

    public static void main(String[] args) {
        new Question4BlueCar();
    }
}
