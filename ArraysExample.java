public class ArraysExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Access elements by index
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Loop through the array using a for loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Loop through the array using an enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (int num : numbers) {
            System.out.println("Value: " + num);
        }

        // Example with a String array
        String[] fruits = {"Apple", "Banana", "Cherry"};

        System.out.println("\nString array elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
