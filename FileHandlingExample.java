import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        String filename = "example.txt";

        // Writing to a file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a file handling example in Java.\n");
            writer.write("We are writing text to a file.\n");
            writer.write("Now we will read it back!");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\nReading data from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
