// InterfaceExample.java

// Define an interface
interface Animal {
    void sound();   // abstract method
    void sleep();   // abstract method
}

// Implementing class Dog
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps peacefully.");
    }
}

// Implementing class Cat
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps quietly.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Using interface reference
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();

        System.out.println();

        Animal cat = new Cat();
        cat.sound();
        cat.sleep();
    }
}
