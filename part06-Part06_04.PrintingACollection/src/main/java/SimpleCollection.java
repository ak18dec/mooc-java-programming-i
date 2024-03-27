
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if(this.elements.size() == 0){
            return "The collection "+ name + " is empty.";
        }
        int count = elements.size();
        String str = "The collection " + name +" has " + count + (count > 1 ? " elements" : " element") + ":\n";
        for(int i=0;i<count;i++) {
            str += elements.get(i);
            if(i<count-1){
                str += "\n";
            }
            
        }
        return str;
    }
    
}
