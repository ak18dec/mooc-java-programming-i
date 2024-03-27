import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {

    private int maxWeight;
    private int totalWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if((totalWeight + item.getWeight()) <= maxWeight) {
            totalWeight += item.getWeight();
            items.add(item);
        }
    }

    public String toString() {
        int count = items.size();
        return count == 0 ? "no items (0 kg)" : (count == 1 ? "1 item" : count+" items") + " (" + totalWeight + " kg)";  
    }

    public void printItems() {
        items.forEach(System.out::println);
    }

    public int totalWeight() {
        return totalWeight;
    }

    public Item heaviestItem() {
        if(items.isEmpty()) return null;
        return items.stream().max(Comparator.comparingInt(Item::getWeight)).get();
    }
}
