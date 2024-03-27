import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> tasks =  new ArrayList<>();

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        int count = tasks.size();
        for(int i=0;i<count;i++) {
            System.out.println(i+1 + ": " + tasks.get(i));
        }
    }

    public void remove(int number) {
        tasks.remove(number-1);
    }
}
