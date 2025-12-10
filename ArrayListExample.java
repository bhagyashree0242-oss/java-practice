import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        // Display the ArrayList
        System.out.println("Names: " + names);

        // Access elements by index
        System.out.println("First name: " + names.get(0));
        System.out.println("Second name: " + names.get(1));

        // Modify an element
        names.set(2, "Chris");
        System.out.println("After modification: " + names);

        // Remove an element
        names.remove("Bob");
        System.out.println("After removing Bob: " + names);

        // Iterate using for-each loop
        System.out.println("Iterating through names:");
        for (String name : names) {
            System.out.println(name);
        }

        // Check size
        System.out.println("Total names: " + names.size());
    }
}
