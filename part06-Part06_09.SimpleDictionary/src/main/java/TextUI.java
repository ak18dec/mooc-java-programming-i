import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {

        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if(command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
                continue;
            }
            if(command.equals("search")) {
                System.out.print("To be translated:");
                String wordTobeTranslated = scanner.nextLine();
                String translatedWord = this.simpleDictionary.translate(wordTobeTranslated);
                if(translatedWord == null) {
                    System.out.println("Word "+ wordTobeTranslated + " was not found");
                }else {
                    System.out.println("Translation: "+this.simpleDictionary.translate(wordTobeTranslated));
                }
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}
