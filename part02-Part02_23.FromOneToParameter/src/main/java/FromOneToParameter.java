import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printUntilNumber(scan.nextInt());
    }

    public static void printUntilNumber(int number) {
        for(int i=1;i<=number;i++){
            System.out.println(i);
        }
    }
}
