
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        swap(array, 1, 0);

        for(int i : array) {
            System.out.print(i + " ");
        }
        // System.out.println(array);
    }

    public static int smallest(int[] array) {
        int small = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] < small) {
                small = array[i];
            }
        }
        return small;
    }

    public static int indexOfSmallest(int[] array) {
        return indexOfSmallestFrom(array, 0);
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallIndex = startIndex;
        int smallest = table[startIndex];

        for(int i=startIndex;i<table.length;i++) {
            if(table[i] < smallest) {
                smallIndex = i;
                smallest = table[i];
            }
        }
        return smallIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {


        for(int i=0;i<array.length;i++){
            // int smallest = smallest(array);
            int smallIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallIndex);
        }
        
    }

}
