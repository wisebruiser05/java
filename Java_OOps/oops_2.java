abstract class Animal {
    abstract void walk();
    Animal() {
        System.out.println("You are creating a new Animal.");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Creating a new Horse.");
    }
    public void walk() {
        System.out.println("Walk on 4 legs!");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walk on 2 legs!");
    }
}

public class oops_2 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        //h1.walk();
        //h1.eat();
        Chicken c1 = new Chicken();
        //c1.walk();
        //c1.eat();
    }
}
