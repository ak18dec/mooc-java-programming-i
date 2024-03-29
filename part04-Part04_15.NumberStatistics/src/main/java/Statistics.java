
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        
    }

    public void addNumber(int number) {
        this.sum += number;
        this.count++;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if(count != 0) {
            return (double)sum/count;
        }
        return 0.0;
    }
}
