import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "Diana");

        // Display the HashMap
        System.out.println("Students HashMap: " + students);

        // Access a value by key
        System.out.println("Student with ID 102: " + students.get(102));

        // Modify a value
        students.put(103, "Chris");
        System.out.println("After modification: " + students);

        // Remove a key-value pair
        students.remove(104);
        System.out.println("After removing ID 104: " + students);

        // Check if a key exists
        if (students.containsKey(101)) {
            System.out.println("ID 101 exists in the HashMap.");
        }

        // Check if a value exists
        if (students.containsValue("Alice")) {
            System.out.println("Alice is in the HashMap.");
        }

        // Iterate through the HashMap
        System.out.println("Iterating through HashMap:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
