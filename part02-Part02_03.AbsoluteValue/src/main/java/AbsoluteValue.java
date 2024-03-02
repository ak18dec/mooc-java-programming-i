
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input < 0) {
            System.out.println(-1 * input);
        } else {
            System.out.println(input);
        }
    }
}
