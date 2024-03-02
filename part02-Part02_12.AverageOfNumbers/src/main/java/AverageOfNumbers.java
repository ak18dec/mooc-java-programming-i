
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;
        int input = 0;
        while(true) {
            System.out.println("Give a number:");
            input = scanner.nextInt();
            if(input == 0) {
                break;
            } else {
                count++;
                sum += input;
            }
        }
        avg =  1.0 * sum / count;
        System.out.println("Average of the numbers: " + avg);
        
        
    }
}
