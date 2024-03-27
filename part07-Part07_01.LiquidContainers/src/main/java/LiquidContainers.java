
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        System.out.println("First: 0/100");
        System.out.println("Second: 0/100");
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if(amount > 0) {
                if(command.equals("add")) {
                    if(first+amount <= 100) {
                        first += amount;
                    }else {
                        first = 100;
                    }
                }
                if(command.equals("move")) {
                    if(amount > first) {
                        second += first;
                        if(second > 100) second = 100;
                        first = 0;
                    }else {
                        first -= amount;
                        second += amount;
                        if(second > 100) second = 100;
                    }
                }
                if(command.equals("remove")) {
                    if(amount > second) {
                        second = 0;
                    }else {
                        second -= amount;
                    }
                }
            }
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
        }
    }
}
