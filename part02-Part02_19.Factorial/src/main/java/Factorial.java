
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int num = scanner.nextInt();
        int fact = 0;
        for(int i=0;i<=num;i++) {
            if(i == 0) {
                fact = 1;
            }else {
                fact = fact * i;
            }
        }
        System.out.println("Factorial: " + fact);
    }
}
