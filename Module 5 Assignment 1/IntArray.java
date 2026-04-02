import java.util.Arrays;
import java.util.Random;

public class IntArray {
    // Private data fields for the IntArray class
    private int length;
    private int[] myArray;



    public IntArray(int l) {
        this.length = l;
        this.myArray = new int[l];
    }



    public void clear() {
        this.length = 0;
        this.myArray = new int[0];
    }


     // Fills the array with random integers between 1 and 6 (inclusive)

    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < this.length; i++) {
            // Generate random number between 1 and 6 (inclusive)
            this.myArray[i] = rand.nextInt(6) + 1;
        }
    }

    public int get(int element) {
        return this.myArray[element];
    }


    public void set(int element, int newValue) {
        this.myArray[element] = newValue;
    }


    public int size() {
        return this.length;
    }

    // Checks if the array empty

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void sort() {
        Arrays.sort(this.myArray);
    }

    public String toString() {
        // Build a string showing all array elements
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.length; i++) {
            sb.append(this.myArray[i]);
            if (i < this.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}