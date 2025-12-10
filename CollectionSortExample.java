import java.util.*;

public class CollectionSortExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Before Sorting: " + fruits);

        // Sort using Collections.sort
        Collections.sort(fruits);

        System.out.println("After Sorting: " + fruits);
    }
}
