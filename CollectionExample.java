import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // List Example
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("List: " + fruits);

        // Set Example
        Set<String> uniqueFruits = new HashSet<>(fruits);
        uniqueFruits.add("Apple"); // Duplicate won't be added
        System.out.println("Set: " + uniqueFruits);

        // Map Example
        Map<Integer, String> fruitMap = new HashMap<>();
        fruitMap.put(1, "Apple");
        fruitMap.put(2, "Banana");
        fruitMap.put(3, "Mango");
        System.out.println("Map: " + fruitMap);

        // Iterating over Map
        for (Map.Entry<Integer, String> entry : fruitMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
