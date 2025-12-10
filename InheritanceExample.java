// InheritanceExample.java

// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks: Woof Woof!");
    }
}

// Another child class (inherits from Animal)
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows: Meow Meow!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create Dog object
        Dog dog = new Dog();
        dog.eat();   // Inherited from Animal
        dog.sleep(); // Inherited from Animal
        dog.bark();  // Specific to Dog

        System.out.println();

        // Create Cat object
        Cat cat = new Cat();
        cat.eat();   // Inherited from Animal
        cat.sleep(); // Inherited from Animal
        cat.meow();  // Specific to Cat
    }
}
