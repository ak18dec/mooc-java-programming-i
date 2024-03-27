import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> gifts = new ArrayList<>();
    public Package() {}
    
    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        return gifts.stream().mapToInt(item -> item.getWeight()).sum();
    }
}
