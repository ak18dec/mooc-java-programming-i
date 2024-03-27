import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        
        if((totalWeight+suitcase.totalWeight()) <= maxWeight) {
            totalWeight += suitcase.totalWeight();
            suitcases.add(suitcase);
        }

    }

    public String toString() {
        return suitcases.size() + " suitcases ("+ totalWeight + " kg)";
    }

    public void printItems() {
        suitcases.forEach(suitcase-> suitcase.printItems());
    }

}
