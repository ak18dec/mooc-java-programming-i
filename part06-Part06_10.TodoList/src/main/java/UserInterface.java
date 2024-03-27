import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")) {
                break;
            }
            if(command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            }
            if(command.equals("list")) {
                todoList.print();
            }
            if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = scanner.nextInt();
                todoList.remove(number);
            }

        }
    }
}
