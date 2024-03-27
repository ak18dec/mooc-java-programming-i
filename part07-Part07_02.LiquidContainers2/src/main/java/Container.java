public class Container {

    private int liquidAmount;
    
    public Container() {}


    public int contains() {
        return liquidAmount;
    }

    public void add(int amount) {
        if(amount > 0) {
            liquidAmount += amount;
        }

        if(liquidAmount > 100) liquidAmount = 100;
    }

    public void remove(int amount) {
        if(amount > 0) {
            liquidAmount -= amount;
        }

        if(liquidAmount < 0) liquidAmount = 0;
    }

    public String toString() {
        return liquidAmount + "/100";
    }
}
