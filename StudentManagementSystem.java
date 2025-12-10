import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Course: " + course;
    }
}

public class StudentManagementSystem {
    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        students.add(new Student(id, name, age, course));
        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\n--- Student List ---");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student found: " + s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getId() == id) {
                iterator.remove();
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
