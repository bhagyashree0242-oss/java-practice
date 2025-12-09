class Person {
    // Fields (attributes)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods (encapsulation)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

// A subclass (inheritance)
class Student extends Person {
    private String major;

    // Constructor
    public Student(String name, int age, String major) {
        super(name, age); // call parent constructor
        this.major = major;
    }

    // Overriding method
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + "-year-old student majoring in " + major + ".");
    }
}

// Main class
public class OOPExample {
    public static void main(String[] args) {
        // Create a Person object
        Person p1 = new Person("Alice", 30);
        p1.introduce();

        // Create a Student object
        Student s1 = new Student("Bob", 20, "Computer Science");
        s1.introduce();
    }
}
