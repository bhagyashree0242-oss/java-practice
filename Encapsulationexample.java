// EncapsulationExample.java

class Student {
    // Private fields (data hiding)
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) { // validation logic
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setters
        student.setName("Rahul");
        student.setAge(21);

        // Accessing values using getters
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Trying invalid age
        student.setAge(-5); // will trigger validation
    }
}
