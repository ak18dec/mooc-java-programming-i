
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;
        while(true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if(input == 0) {
                break;
            } 
            if(input > 0){
                count++;
                sum += input;
            }
        }
        if(count <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            avg =  1.0 * sum / count;
            System.out.println("Average of the numbers: " + avg);
        }
        
    }
}
