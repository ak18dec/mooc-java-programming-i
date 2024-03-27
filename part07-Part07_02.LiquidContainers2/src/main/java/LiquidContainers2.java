
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

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
                    first.add(amount);
                }
                if(command.equals("move")) {
                    if(amount > first.contains()) {
                        second.add(first.contains());
                        first = new Container();
                    }else {
                        first.remove(amount);
                        second.add(amount);
                    }

                }
                if(command.equals("remove")) {
                    second.remove(amount);
                }
            }
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
        }
    }

}
