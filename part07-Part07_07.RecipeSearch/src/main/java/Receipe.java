import java.util.ArrayList;

public class Receipe {
    private String name;
    private int time;
    private String ingredients;

    public Receipe(String name, int time, String ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void getIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String toString() {
        return name + ", cooking time: " + time;
    }
}
