
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        ArrayList<Bird> birds = new ArrayList<>();

        while(true) {
            System.out.print("? ");
            String command = scan.nextLine();
            if(command.equals("Add")){
                add(scan, birds);
            }else if(command.equals("Observation")) {
                observation(scan, birds);
            }else if(command.equals("All")) {
                all(birds);
            }else if(command.equals("One")) {
                one(scan, birds);
            }else {
                break;
            }
        }

    }

    private static void add(Scanner scanner, ArrayList<Bird> birds) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();
        Bird bird = new Bird(name, latinName);
        birds.add(bird);
    }

    private static void observation(Scanner scanner, ArrayList<Bird> birds) {
        System.out.print("Bird? ");
        String query = scanner.nextLine();
        boolean birdFound = false;
        for(Bird bird : birds) {
            if(bird.getName().equals(query)){
                bird.incObservation();
                birdFound = true;
                break;
            }
        }
        if(!birdFound) {
            System.out.println("Not a bird!");
        }
    }

    private static void all(ArrayList<Bird> birds) {
        birds.forEach(System.out::println);
    }

    private static void one(Scanner scanner, ArrayList<Bird> birds) {
        System.out.print("Bird? ");
        String query = scanner.nextLine();
        for (Bird bird : birds) {
            if(bird.getName().equals(query)){
                System.out.println(bird);
                break;
            }
        }
    }
}
