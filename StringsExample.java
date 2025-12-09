public class StringExample {
    public static void main(String[] args) {
        // Creating strings
        String greeting = "Hello";
        String name = "World";

        // Concatenation
        String message = greeting + " " + name;
        System.out.println("Concatenation: " + message);

        // String length
        System.out.println("Length of message: " + message.length());

        // Accessing characters
        System.out.println("First character: " + message.charAt(0));
        System.out.println("Last character: " + message.charAt(message.length() - 1));

        // Substring
        System.out.println("Substring (0,5): " + message.substring(0, 5));

        // Comparison
        String anotherGreeting = "hello";
        System.out.println("Equals: " + greeting.equals(anotherGreeting));
        System.out.println("Equals ignoring case: " + greeting.equalsIgnoreCase(anotherGreeting));

        // Changing case
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());

        // Searching
        System.out.println("Index of 'World': " + message.indexOf("World"));
        System.out.println("Contains 'Hello': " + message.contains("Hello"));
    }
}
