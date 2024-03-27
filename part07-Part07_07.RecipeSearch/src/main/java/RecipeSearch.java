
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        ArrayList<String> list = getDataFromFile(file);
        ArrayList<Receipe> receipes = getReceipesFromData(list);

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        while(true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if(command.equals("stop")) {
                break;
            }
            if(command.equals("list")) {
                printReceipes(receipes);
            }
            if(command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                searchReceipesByName(receipes, word);
            }
            if(command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                searchReceipesByCookingTime(receipes, maxTime);
            }
            if(command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                searchReceipesByIngredient(receipes, ingredient);
            }
        }
    }

    private static ArrayList<String> getDataFromFile(String file) {
        ArrayList<String> list = new ArrayList<>();
        try(Scanner scanner1 = new Scanner(Paths.get(file))) {
            String s = "";
            while(scanner1.hasNextLine()) {
                String s1 = scanner1.nextLine();
                if(s1.trim().length() == 0) {
                    list.add(s);
                    s = "";
                }else {
                    s = s.concat(s1).concat(";");
                }
            }
            list.add(s);
            return list;
        }catch(Exception e) {
            System.out.println("Error: "+ e.getMessage());
            return list;
        }
    }

    private static ArrayList<Receipe> getReceipesFromData(ArrayList<String> list) {
       ArrayList<Receipe> receipes = new ArrayList<>();
       for(String str : list) {
            String[] parts = str.split(";", 3);
            String name = parts[0];
            int time = Integer.valueOf(parts[1]);
            String ingredients = parts[2];
            Receipe receipe = new Receipe(name, time, ingredients);
            receipes.add(receipe);
       }
       return receipes;
    }

    private static void printReceipes(ArrayList<Receipe> receipes) {
        System.out.println("Recipes:");
        receipes.forEach(System.out::println);
    }

    private static void searchReceipesByName(ArrayList<Receipe> receipes, String name) {
        ArrayList<Receipe> receipes2 = new ArrayList<>();
        receipes2 = (ArrayList<Receipe>) receipes.stream().filter(r -> r.getName().contains(name)).collect(Collectors.toList());
        printReceipes(receipes2);
    }

    private static void searchReceipesByCookingTime(ArrayList<Receipe> receipes, int time) {
        ArrayList<Receipe> receipes2 = new ArrayList<>();
        receipes2 = (ArrayList<Receipe>) receipes.stream().filter(r -> r.getTime() <= time).collect(Collectors.toList());
        printReceipes(receipes2);
    }

    private static void searchReceipesByIngredient(ArrayList<Receipe> receipes, String ingredient) {
        ArrayList<Receipe> receipes2 = new ArrayList<>();
        for(Receipe receipe : receipes) {
            String [] items = receipe.getIngredients().split(";");
            for(String s : items) {
                if(s.equals(ingredient)){
                    receipes2.add(receipe);
                    break;
                }
            }
        }
        printReceipes(receipes2);
    }
}
