// ExtensionExample.java

// Superclass
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Subclass extending Vehicle
class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking: Beep Beep!");
    }
}

// Another subclass extending Vehicle
class Bike extends Vehicle {
    void kickStart() {
        System.out.println("Bike is kick-started!");
    }
}

public class ExtensionExample {
    public static void main(String[] args) {
        // Car object
        Car car = new Car();
        car.start();     // inherited from Vehicle
        car.honk();      // specific to Car
        car.stop();      // inherited from Vehicle

        System.out.println();

        // Bike object
        Bike bike = new Bike();
        bike.start();    // inherited from Vehicle
        bike.kickStart();// specific to Bike
        bike.stop();     // inherited from Vehicle
    }
}
