
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                int age = Integer.valueOf(parts[1]);
                System.out.println(parts[0]+", age: " + parts[1] + " " + (age == 1 ? "year" : "years"));
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
