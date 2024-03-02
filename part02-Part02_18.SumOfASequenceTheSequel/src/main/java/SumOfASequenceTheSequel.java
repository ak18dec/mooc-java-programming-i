
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int num1 = scanner.nextInt();
        System.out.println("Last number?");
        int num2 = scanner.nextInt();
        int sum =0;
        for(int i=num1;i<=num2;i++){
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
