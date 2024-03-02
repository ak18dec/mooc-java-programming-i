
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String inputS = scan.nextLine();
        System.out.println("Give an integer:");
        Integer inputI = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        Double inputD = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean inputB = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + inputS);
        System.out.println("You gave the integer " + inputI);
        System.out.println("You gave the double " + inputD);
        System.out.println("You gave the boolean " + inputB);

         

    }
}
