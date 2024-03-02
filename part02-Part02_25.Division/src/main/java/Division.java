import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"
        Scanner scan = new Scanner(System.in);
        int numerator = scan.nextInt();
        int denominator = scan.nextInt();
        division(numerator, denominator);
    }

    public static void division(int numerator, int denominator)  {
        if(denominator > 0) {
            System.out.println((double)numerator/denominator);
        }
    }

}
