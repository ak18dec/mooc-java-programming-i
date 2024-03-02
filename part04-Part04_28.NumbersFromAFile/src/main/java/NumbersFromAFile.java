
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        
        try(Scanner filScanner = new Scanner(Paths.get(file))) {
            int count = 0;
            while(filScanner.hasNextLine()) {
                int row = Integer.valueOf(filScanner.nextLine());
                if(row >= lowerBound && row <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch(Exception e) {

        }
    }

}
