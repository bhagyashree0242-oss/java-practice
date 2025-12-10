class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog overrides sound()
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Subclass Cat overrides sound()
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Reference of type Animal, but object is Dog
        Animal a1 = new Dog();
        a1.sound(); // Calls Dog's version

        // Reference of type Animal, but object is Cat
        Animal a2 = new Cat();
        a2.sound(); // Calls Cat's version

        // Reference of type Animal, object is Animal itself
        Animal a3 = new Animal();
        a3.sound(); // Calls Animal's version
    }
