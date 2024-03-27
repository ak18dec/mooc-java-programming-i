
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<>();
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if(identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if(name.isEmpty()) {
                break;
            }
            Item item = new Item(identifier, name);
            if(!containInList(list, item)) {
                list.add(item);
            }
        }

        printList(list);

    }

    private static void printList(ArrayList<Item> list) {
        for(Item item :list) {
            System.out.println(item);
        }
    }

    private static boolean containInList(ArrayList<Item> list, Item elem) {
        if(list.isEmpty()) return false;
        for(Item item : list) {
            if(item.equals(elem)) {
                return true;
            }
        }
        return false;
    }
}
